# Evaluation Scenarios

This folder contains the executable test scenarios used to evaluate **DSML4XAI**.
Each successful scenario folder contains:

- an input DSML specification (`*.xai`)
- the generated Jupyter notebook (`*.ipynb`)
- an execution notebook with outputs preserved (`*_execution.ipynb`)
- a generation report (`*_generation_report.log`)

Failure scenarios contain only the input specification (`*.xai`); no notebook is produced because the verification layer rejects the specification before generation is attempted.

---

## Folder Structure

```
evaluation-scenarios/
├── datasets/                  # Datasets used in scenarios (see Dataset Provenance below)
└── scenarios/
    ├── scenario_1/            # S1  — success
    ├── scenario_2/            # S2  — success
    ├── ...
    ├── scenario_11/           # S11 — success
    ├── scenario_12/           # S12 — failure (syntactic violation)
    ├── scenario_13/           # S13 — failure (unknown model type)
    ├── scenario_14/           # S14 — failure (unknown explanation method)
    └── scenario_15/           # S15 — failure (expertise incompatibility)
```

---

## Dataset Provenance

| Dataset file(s) | Format(s) used | Provenance |
|---|---|---|
| `breast_cancer.csv`, `breast_cancer.parquet`, `breast_cancer.json` | CSV, PARQUET, JSON | Derived from the **Breast Cancer Wisconsin (Diagnostic)** dataset via the scikit-learn loader. Reference: https://scikit-learn.org/stable/modules/generated/sklearn.datasets.load_breast_cancer.html |
| `banknote.csv` | CSV | **Banknote Authentication** dataset from UCI. Reference: https://archive.ics.uci.edu/dataset/267/banknote+authentication |
| `heart_scale` | LIBSVM | Taken from the official LIBSVM datasets page. Reference: https://www.csie.ntu.edu.tw/~cjlin/libsvmtools/datasets/binary/heart_scale |

---

## Abbreviations

| Symbol | Meaning |
|--------|---------|
| B / I / A | Beginner / Intermediate / Advanced |
| PT / TB / VS | `plainText` / `table` / `visual` |
| def | attribute omitted in the DSL input; resolved through defaults |
| learn / debug / just / gen | `learning` / `debugging` / `justification` / `general` |
| L1 / L2 / L4 | Verification layer: 1 = syntactic, 2 = static semantic, 4 = Z3 formal |

---

## Scenario Summary

### Positive Scenarios (S1–S11) — Specification valid, notebook generated

| ID | AI Model | Dataset | Exp. | Format(s) | Details | Purpose | Method (input → resolved) | Defaults applied | Exec. | Conf. |
|----|----------|---------|------|-----------|---------|---------|--------------------------|-----------------|-------|-------|
| S1 | MLPClassifier | breast_cancer (CSV) | B | PT | def | learn | auto → LIME | details | success | Full |
| S2 | MLPClassifier | breast_cancer (CSV) | A | PT, VS | med | debug | LIME | — | success | Full |
| S3 | RandomForest | breast_cancer (CSV) | I | PT, TB, VS | high | gen | FeatureImportance | — | success | Full |
| S4 | LogisticRegression | banknote (CSV) | A | PT, TB, VS | med | just | SHAP | — | success | Full |
| S5 | DecisionTree | banknote (CSV) | I | PT, VS | med | learn | PDP | — | success | Full |
| S6 | KNN | breast_cancer (CSV) | I | PT, TB, VS | med | gen | ICE | — | success | Full |
| S7 | LogisticRegression | breast_cancer (CSV) | B | def | def | def | auto → FeatureImportance | format, details, purpose | success | Full |
| S8 | RandomForest | breast_cancer (CSV) | A | VS | high | gen | auto → PDP | — | success | Full |
| S9 | RandomForest | breast_cancer (PARQUET) | I | PT, TB | med | gen | FeatureImportance | — | success | Full |
| S10 | DecisionTree | breast_cancer (JSON) | I | PT | def | learn | auto → PDP | details | success | Full |
| S11 | SVM | heart_scale (LIBSVM) | I | PT | low | gen | LIME | — | success | Full |

### Failure Scenarios (S12–S15) — Specification rejected, no notebook produced

| ID | AI Model | Dataset | Exp. | Method | Violation | Rejected at | Conf. |
|----|----------|---------|------|--------|-----------|-------------|-------|
| S12 | RandomForest | — | I | — | Missing mandatory `data` block | L1 — Xtext parser (syntactic) | Rejected |
| S13 | GBM | breast_cancer (CSV) | I | — | `GBM` not declared in `config.xmi` | L2 — `@Check` validator (unknown model type) | Rejected |
| S14 | RandomForest | breast_cancer (CSV) | I | GradCAM | `GradCAM` not declared in `config.xmi` | L2 — `@Check` validator (unknown method) | Rejected |
| S15 | RandomForest | breast_cancer (CSV) | B | SHAP | SHAP requires Intermediate (rank 2); user is Beginner (rank 1) | L4 — Z3 formal verification (unsatisfiable spec) | Rejected |

---

## How to Use the Scenarios

**Successful scenarios (S1–S11):**

1. Open the scenario folder.
2. Inspect the `*.xai` file to see the input specification.
3. Inspect the generated `*.ipynb` notebook to see the structure produced by the generator.
4. Open `*_execution.ipynb` to review preserved execution outputs.
5. Inspect `*_generation_report.log` for the resolved method, applied defaults, required packages, and any warnings.

**Failure scenarios (S12–S15):**

1. Open the scenario folder and inspect the `*.xai` file.
2. Load the file in the DSML4XAI editor — the violation is surfaced as an editor error or warning at the indicated verification layer.
3. No notebook or log is produced because generation is blocked by the verification gate.

---

## Notes

- Auto-selection of the explanation method can be observed in **S1**, **S7**, **S8**, and **S10** (no `explain` keyword in the DSL input).
- Default resolution (format, details, purpose) is demonstrated in **S1**, **S7**, and **S10**.
- Dataset-type coverage spans **CSV** (S1–S8), **PARQUET** (S9), **JSON** (S10), and **LIBSVM** (S11).
- The four failure scenarios each target a distinct verification layer, confirming that the progressive rejection strategy operates correctly at each level.
