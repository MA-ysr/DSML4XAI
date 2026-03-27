package com.example.xai.verification;

import com.microsoft.z3.*;
import com.example.xai.model.explainableAI.Model;
import com.example.xai.model.explainableAI.User;
import com.example.xai.model.xaiConfig.*;
import com.example.xai.generator.ConfigurationCache;

import java.util.*;

/**
 * Provides Z3-backed formal verification for DSML4XAI.
 *
 * All methods receive a Configuration object (from ConfigurationCache)
 * and therefore read config.xmi through the existing EMF infrastructure.
 * No values are hardcoded.
 */
public class Z3VerificationService {

    /**
     * Verifies the three repository-level properties (P1/P2/P3).
     * Safe to call even if Z3 is unavailable — returns SKIPPED results.
     */
	public static List<Z3VerificationResult> verifyRepository(Configuration config) {
        List<Z3VerificationResult> results = new ArrayList<>();
        if (!Z3NativeLoader.ensureLoaded()) {
            results.add(Z3VerificationResult.skipped("P1"));
            results.add(Z3VerificationResult.skipped("P2"));
            results.add(Z3VerificationResult.skipped("P3"));
            return results;
        }
        try (Context ctx = new Context()) {
            results.add(checkP1SelectionCompleteness(ctx, config));
            results.add(checkP2FormatCoverage(ctx, config));
            results.add(checkP3RankOrdering(ctx, config));
        } catch (Exception e) {
            results.add(Z3VerificationResult.error("P1-P3", e.getMessage()));
        }
        return results;
    }

    /**
     * Verifies a single user specification (a parsed .xai Model instance).
     *
     * Checks whether the auto-selection procedure can succeed for the
     * declared (modelType, expertise, formats, purpose) combination,
     * and whether any explicitly declared method is compatible.
     *
     * @param spec   the parsed Model EObject from the user's .xai file
     * @param config the Configuration loaded by ConfigurationCache
     * @return a single Z3VerificationResult for this specification
     */
    public static Z3VerificationResult verifySpecification(
            Model spec, Configuration config) {

        if (!Z3NativeLoader.ensureLoaded())
            return Z3VerificationResult.skipped("SPEC");

        try (Context ctx = new Context()) {
            return checkSpecification(ctx, spec, config);
        } catch (Exception e) {
            return Z3VerificationResult.error("SPEC", e.getMessage());
        }
    }

    // ── P1: Selection Completeness ────────────────────────────────────────

    private static Z3VerificationResult checkP1SelectionCompleteness(
            Context ctx, Configuration config) {

        // For each AI model, assert: there exists NO compatible method for
        // some expertise rank.  UNSAT => a compatible method always exists.
        for (AIModel aiModel : config.getModels()) {
            List<ExplanationMethod> allowed = aiModel.getAllowedMethods();
            if (allowed.isEmpty()) {
                return Z3VerificationResult.violated("P1",
                    "Model '" + aiModel.getName() + "' has no allowed methods.",
                    "Fix: add at least one method to allowedMethods in config.xmi.");
            }

            Solver solver = ctx.mkSolver();
            IntExpr expRank = ctx.mkIntConst("exp_rank");

            // Domain: exp_rank must be one of the defined expertise ranks
            List<BoolExpr> domainOr = new ArrayList<>();
            for (ExpertiseLevel el : config.getExpertiseLevels()) {
                domainOr.add(ctx.mkEq(expRank, ctx.mkInt(el.getRank())));
            }
            solver.add(ctx.mkOr(domainOr.toArray(new BoolExpr[0])));

            // Negation: every allowed method has minExpertiseRank > exp_rank
            List<BoolExpr> allIncompatible = new ArrayList<>();
            for (ExplanationMethod m : allowed) {
                ExpertiseLevel minExp = m.getMinExpertise();
                if (minExp == null) continue;
                allIncompatible.add(ctx.mkGt(
                    ctx.mkInt(minExp.getRank()), expRank));
            }
            if (allIncompatible.isEmpty()) continue;
            solver.add(ctx.mkAnd(allIncompatible.toArray(new BoolExpr[0])));

            Status result = solver.check();
            if (result == Status.SATISFIABLE) {
                // Z3 found an expertise rank with no compatible method
                com.microsoft.z3.Model z3m = solver.getModel();
                long badRank = ((IntNum) z3m.eval(expRank, false)).getInt64();
                String expName = config.getExpertiseLevels().stream()
                    .filter(e -> e.getRank() == badRank)
                    .map(ExpertiseLevel::getName)
                    .findFirst().orElse("rank=" + badRank);
                return Z3VerificationResult.violated("P1",
                    "Model '" + aiModel.getName() + "' has no compatible method "+
                    "for expertise='" + expName + "' (rank=" + badRank + ").",
                    "Allowed methods: " + allowed.stream()
                        .map(ExplanationMethod::getName)
                        .reduce((a,b)->a+", "+b).orElse("-") +
                    ". Add a method with minExpertise <= " + expName +
                    " to config.xmi.");
            } else if (result == Status.UNKNOWN) {
                return Z3VerificationResult.error("P1",
                    "Z3 returned UNKNOWN for model '" + aiModel.getName() + "'.");
            }
        }
        return Z3VerificationResult.proved("P1",
            "For every (AIModel, ExpertiseLevel) pair, at least one compatible "+
            "method exists. autoPickMethodEntry() will never return null.");
    }

    // ── P2: Format Coverage ───────────────────────────────────────────────

    private static Z3VerificationResult checkP2FormatCoverage(
            Context ctx, Configuration config) {

        Set<String> knownFormats = new HashSet<>();
        for (OutputFormat of : config.getOutputFormats()) {
            knownFormats.add(of.getName().toLowerCase());
        }

        for (ExplanationMethod m : config.getMethods()) {
            if (m.getSupportedFormats().isEmpty()) {
                return Z3VerificationResult.violated("P2",
                    "Method '" + m.getName() + "' has an empty supportedFormats list.",
                    "Add at least one OutputFormat to this method in config.xmi.");
            }
            for (OutputFormat fmt : m.getSupportedFormats()) {
                if (!knownFormats.contains(fmt.getName().toLowerCase())) {
                    return Z3VerificationResult.violated("P2",
                        "Method '" + m.getName() + "' references format '" +
                        fmt.getName() + "' which is not in outputFormats.",
                        "Add format '" + fmt.getName() + "' to config.xmi outputFormats.");
                }
            }
        }
        return Z3VerificationResult.proved("P2",
            "All methods reference only valid, non-empty output format sets.");
    }

    // ── P3: Expertise Rank Well-Ordering ──────────────────────────────────

    private static Z3VerificationResult checkP3RankOrdering(
            Context ctx, Configuration config) {

        List<ExpertiseLevel> levels = config.getExpertiseLevels();
        if (levels.size() < 2) {
            return Z3VerificationResult.proved("P3",
                "Only one expertise level defined — ordering is trivially sound.");
        }

        Solver solver = ctx.mkSolver();

        // Declare one integer variable per expertise level
        Map<String, IntExpr> rankVars = new LinkedHashMap<>();
        for (ExpertiseLevel el : levels) {
            IntExpr v = ctx.mkIntConst("rank_" + el.getName());
            rankVars.put(el.getName(), v);
            solver.add(ctx.mkEq(v, ctx.mkInt(el.getRank()))); // assign actual rank
        }

        // Assert negation: two distinct levels share the same rank
        List<String> names = new ArrayList<>(rankVars.keySet());
        List<BoolExpr> duplicates = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                duplicates.add(ctx.mkEq(
                    rankVars.get(names.get(i)),
                    rankVars.get(names.get(j))));
            }
        }
        solver.add(ctx.mkOr(duplicates.toArray(new BoolExpr[0])));

        Status result = solver.check();
        if (result == Status.UNSATISFIABLE) {
            return Z3VerificationResult.proved("P3",
                "All expertise ranks are unique. expertiseRank() comparisons are sound.");
        } else if (result == Status.SATISFIABLE) {
            com.microsoft.z3.Model z3m = solver.getModel();
            StringBuilder ce = new StringBuilder();
            for (int i = 0; i < names.size(); i++)
                for (int j = i+1; j < names.size(); j++) {
                    long r1 = ((IntNum)z3m.eval(rankVars.get(names.get(i)),false)).getInt64();
                    long r2 = ((IntNum)z3m.eval(rankVars.get(names.get(j)),false)).getInt64();
                    if (r1 == r2) ce.append(names.get(i)).append(" and ")
                                    .append(names.get(j)).append(" share rank ").append(r1);
                }
            return Z3VerificationResult.violated("P3",
                "Duplicate expertise ranks found.", ce.toString());
        }
        return Z3VerificationResult.error("P3", "Z3 returned UNKNOWN.");
    }

    // ── Spec-level check ──────────────────────────────────────────────────

    private static Z3VerificationResult checkSpecification(
            Context ctx, Model spec, Configuration config) {

        User user = spec.getUser();
        if (user == null)
            return Z3VerificationResult.error("SPEC", "Spec has no user element.");

        // Resolve the AI model from the repository
        AIModel aiModel = ConfigurationCache.findModel(config, spec.getModelType());
        if (aiModel == null)
            return Z3VerificationResult.skipped("SPEC"); // already caught by @Check

        // Resolve the user's expertise rank
        int userRank = ConfigurationCache.expertiseRank(config, user.getExpertise());
        if (userRank == -1)
            return Z3VerificationResult.skipped("SPEC"); // already caught by @Check

        List<String> requestedFormats = user.getFormat();

        // Case A: explicit method declared — verify it is compatible
        String explicitMethod = spec.getMethod();
        if (explicitMethod != null && !explicitMethod.isBlank()) {
            ExplanationMethod m =
                ConfigurationCache.findMethod(config, explicitMethod);
            if (m == null)
                return Z3VerificationResult.skipped("SPEC");

            // Z3: assert that m.minExpertiseRank > userRank (negation of compatibility)
            Solver solver = ctx.mkSolver();
            IntExpr minRank  = ctx.mkInt(m.getMinExpertise().getRank());
            IntExpr userRankC = ctx.mkInt(userRank);
            solver.add(ctx.mkGt(minRank, userRankC));

            Status s = solver.check();
            if (s == Status.UNSATISFIABLE) {
                return Z3VerificationResult.proved("SPEC",
                    "Method '" + m.getName() + "' is expertise-compatible with '" +
                    user.getExpertise() + "' (minRank="+m.getMinExpertise().getRank()+
                    " <= userRank="+userRank+").");
            } else {
                return Z3VerificationResult.violated("SPEC",
                    "Method '" + m.getName() + "' requires expertise rank >= " +
                    m.getMinExpertise().getRank() + " but user has rank " + userRank + ".",
                    "Change expertise to '" + m.getMinExpertise().getName() +
                    "' or higher, or choose a different method.");
            }
        }

        // Case B: no explicit method — verify that auto-selection can succeed
        Solver solver = ctx.mkSolver();
        IntExpr expRankVar = ctx.mkInt(userRank);  // concrete rank for this spec

        List<BoolExpr> allIncompatible = new ArrayList<>();
        for (ExplanationMethod m : aiModel.getAllowedMethods()) {
            if (m.getMinExpertise() == null) continue;
            // Also filter by requested formats if present
            boolean formatsOk = requestedFormats.isEmpty() ||
                ConfigurationCache.supportsAllFormats(m, requestedFormats);
            if (!formatsOk) {
                // This method is already excluded by format — count it as incompatible
                allIncompatible.add(ctx.mkTrue());
            } else {
                allIncompatible.add(ctx.mkGt(
                    ctx.mkInt(m.getMinExpertise().getRank()), expRankVar));
            }
        }

        if (allIncompatible.isEmpty()) {
            return Z3VerificationResult.violated("SPEC",
                "No allowed methods for model '" + aiModel.getName() + "'.",
                "Add methods to this model in config.xmi.");
        }

        solver.add(ctx.mkAnd(allIncompatible.toArray(new BoolExpr[0])));
        Status s = solver.check();

        if (s == Status.UNSATISFIABLE) {
            return Z3VerificationResult.proved("SPEC",
                "Auto-selection will succeed for (" + spec.getModelType() +
                ", " + user.getExpertise() + "). A compatible method exists.");
        } else {
            String fmt = requestedFormats.isEmpty() ? "any" :
                String.join(", ", requestedFormats);
            return Z3VerificationResult.violated("SPEC",
                "No method in model '" + aiModel.getName() + "' is compatible with "+
                "expertise='" + user.getExpertise() + "' and format=[" + fmt + "].",
                "Consider relaxing the format request or choosing a different model/expertise.");
        }
    }
}

