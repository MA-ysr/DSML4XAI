package com.example.xai.verification;

/**
 * Carries the outcome of a Z3 property check.
 * status: PROVED, VIOLATED, SKIPPED (Z3 unavailable), or ERROR
 */
public class Z3VerificationResult {

    public enum Status { PROVED, VIOLATED, SKIPPED, ERROR }

    private final Status  status;
    private final String  property;   // e.g. "P1", "P2", "P3", "SPEC"
    private final String  message;    // human-readable detail
    private final String  counterexample; // null when PROVED

    public Z3VerificationResult(Status status, String property,
                                String message, String counterexample) {
        this.status         = status;
        this.property       = property;
        this.message        = message;
        this.counterexample = counterexample;
    }

    // Convenience factories
    public static Z3VerificationResult proved(String property, String message) {
        return new Z3VerificationResult(Status.PROVED, property, message, null);
    }
    public static Z3VerificationResult violated(String property,
                                                String message, String ce) {
        return new Z3VerificationResult(Status.VIOLATED, property, message, ce);
    }
    public static Z3VerificationResult skipped(String property) {
        return new Z3VerificationResult(Status.SKIPPED, property,
            "Z3 native library could not be loaded.", null);
    }
    public static Z3VerificationResult error(String property, String msg) {
        return new Z3VerificationResult(Status.ERROR, property, msg, null);
    }

    public Status  getStatus()         { return status; }
    public String  getProperty()       { return property; }
    public String  getMessage()        { return message; }
    public String  getCounterexample() { return counterexample; }
    public boolean isProved()          { return status == Status.PROVED; }
    public boolean isViolated()        { return status == Status.VIOLATED; }

    @Override
    public String toString() {
        return property + " [" + status + "]: " + message
             + (counterexample != null ? "  CE: " + counterexample : "");
    }
}
