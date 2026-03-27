package com.example.xai.verification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;

public final class OCLVerificationSupport {

    private OCLVerificationSupport() {}

    public static Diagnostic validate(EObject obj) {
        return Diagnostician.INSTANCE.validate(obj);
    }

    public static void throwIfInvalid(EObject obj, String label) {
        Diagnostic diagnostic = validate(obj);
        if (diagnostic.getSeverity() >= Diagnostic.ERROR) {
            throw new IllegalArgumentException(
                label + " failed formal validation:\n" + flatten(diagnostic, "")
            );
        }
    }

    private static String flatten(Diagnostic diagnostic, String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent)
          .append("- ")
          .append(diagnostic.getMessage() == null ? "<no message>" : diagnostic.getMessage())
          .append("\n");
        for (Diagnostic child : diagnostic.getChildren()) {
            sb.append(flatten(child, indent + "  "));
        }
        return sb.toString();
    }
}