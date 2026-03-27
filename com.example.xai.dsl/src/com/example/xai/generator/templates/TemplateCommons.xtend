package com.example.xai.generator.templates

import java.util.List

class TemplateCommons {


  def static List<String> preferenceHeader(UserPrefs prefs, String methodName, String scope) {
    #[]
  }

  def static List<String> pythonPrelude(UserPrefs prefs, boolean localExplanation) {
    val lines = newArrayList(
      "import re, numpy as np, pandas as pd, matplotlib.pyplot as plt",
      "",
      "def _get_feature_names():",
      "    try:",
      "        names = list(getattr(data, 'feature_names', []))",
      "        if names and len(names) == X_train.shape[1]:",
      "            return names",
      "    except Exception:",
      "        pass",
      "    if 'df' in globals():",
      "        cols = [c for c in df.columns if c.lower() not in ('label','target','y')]",
      "        if len(cols) == X_train.shape[1]:",
      "            return cols",
      "    return [f'f{j}' for j in range(X_train.shape[1])]",
      "",
      "RAW_NAMES = _get_feature_names()",
      "def _humanize(name):",
      "    s = name.replace('_',' ').strip()",
      "    s = re.sub(r'(?<!^)(?=[A-Z])',' ', s)",
      "    s = re.sub(r'\\s+',' ', s).strip()",
      "    return ' '.join([w.upper() if w.lower() in {'svm','pdp','ice','api','url'} else w.capitalize() for w in s.split(' ')])",
      "HUMAN = [_humanize(n) for n in RAW_NAMES]",
      "",
      "max_display = " + prefs.maxDisplay,
      "table_rows = " + prefs.tableRows,
      "curve_resolution = " + prefs.curveResolution,
      "ice_instances = " + prefs.iceInstances,
      "metric_digits = " + prefs.metricDigits,
      "figure_height = " + prefs.figureHeight,
      "line_width = " + prefs.lineWidth,
      "pdp_sample_rows = " + prefs.pdpSampleRows,
      "ice_detailed_instances = " + prefs.iceDetailedInstances,
      "sampled_curve_points = " + prefs.sampledCurvePoints
    )

    if (localExplanation) {
      if (prefs.isDebuggingPurpose) {
        lines.addAll(#[
          "def _choose_instance_debugging():"
        ])

        if (prefs.hasDebugTechnique("MisclassifiedInstanceSelection")) {
          lines.addAll(#[
            "    try:",
            "        y_pred = model.predict(X_test)",
            "        wrong = np.where(y_pred != y_test)[0]",
            "        if len(wrong) > 0:",
            "            return int(wrong[0]), 'misclassified'",
            "    except Exception:",
            "        pass"
          ])
        }

        if (prefs.hasDebugTechnique("LowConfidenceInstanceSelection")) {
          lines.addAll(#[
            "    try:",
            "        if hasattr(model, 'predict_proba'):",
            "            proba = model.predict_proba(X_test)",
            "            conf = np.max(proba, axis=1)",
            "            return int(np.argmin(conf)), 'lowest-confidence'",
            "    except Exception:",
            "        pass"
          ])
        }

        lines.addAll(#[
          "    return 0, 'default'",
          "",
          "i, reason = _choose_instance_debugging()"
        ])

        if (prefs.showSelectionReason) {
          lines.add("print('[Debugging] Selected instance index = ' + str(i) + ' (reason: ' + str(reason) + ')')")
        }
      } else {
        lines.add("i = 0")
      }
    }

    lines
  }

  def static List<String> debuggingDiagnostics(UserPrefs prefs) {
    if (!prefs.isDebuggingPurpose || prefs.debugTechniques.empty) {
      return #[]
    }

    val lines = newArrayList(
      "print('\\n[Debugging diagnostics]')",
      "print('These diagnostics help inspect where the model succeeds, where it fails, and how errors are distributed.')",
      "from sklearn.metrics import confusion_matrix, classification_report",
      "y_pred = model.predict(X_test)"
    )

    if (prefs.hasDebugTechnique("ConfusionMatrix")) {
      lines.addAll(#[
        "cm = confusion_matrix(y_test, y_pred)",
        "print('Confusion matrix (rows = true labels, columns = predicted labels):')",
        "print(cm)"
      ])

      if (prefs.isLowDetail) {
        lines.add("print('Interpretation: values on the diagonal are correct predictions; off-diagonal values are classification mistakes.')")
      } else if (prefs.isMediumDetail) {
        lines.addAll(#[
          "print('Interpretation: each cell counts how many test examples of one true class were assigned to a predicted class.')",
          "print('The diagonal corresponds to correct predictions; off-diagonal cells reveal the most common confusions.')"
        ])
      } else {
        lines.addAll(#[
          "print('Interpretation: the confusion matrix reports absolute counts. Use it to identify which classes are confused and where errors concentrate.')",
          "print('Large diagonal values indicate many correct predictions; large off-diagonal values highlight systematic error patterns between classes.')"
        ])
      }

      if (prefs.showNormalizedConfusion) {
        lines.addAll(#[
          "cm_sum = cm.sum(axis=1, keepdims=True)",
          "cm_norm = np.divide(cm, cm_sum, where=(cm_sum != 0))",
          "print('Normalized confusion matrix:')",
          "print(np.round(cm_norm, metric_digits))"
        ])

        if (prefs.isMediumDetail) {
          lines.add("print('Interpretation: each row is normalized to sum to 1.0, so values can be read as per-class proportions rather than raw counts.')")
        } else if (prefs.isHighDetail) {
          lines.addAll(#[
            "print('Interpretation: normalization makes the error pattern comparable across classes, even when the class frequencies differ.')",
            "print('A large normalized off-diagonal value means that a substantial fraction of one true class is being assigned to another class.')"
          ])
        }
      }

      if (prefs.showErrorCount) {
        lines.addAll(#[
          "total_errors = int((y_pred != y_test).sum())",
          "print('Total classification errors: ' + str(total_errors))",
          "print('Interpretation: this is the number of test examples whose predicted label differs from the true label.')"
        ])
      }

      if (prefs.hasFormat("visual")) {
        lines.addAll(#[
          "plt.figure(figsize=(6, figure_height))",
          "plt.imshow(cm, interpolation='nearest')",
          "plt.title('Confusion matrix')",
          "plt.colorbar()",
          "tick_marks = np.arange(cm.shape[0])",
          "plt.xticks(tick_marks, tick_marks)",
          "plt.yticks(tick_marks, tick_marks)",
          "plt.ylabel('True label')",
          "plt.xlabel('Predicted label')"
        ])

        if (prefs.annotateVisuals) {
          lines.addAll(#[
            "for ii in range(cm.shape[0]):",
            "    for jj in range(cm.shape[1]):",
            "        plt.text(jj, ii, str(cm[ii, jj]), ha='center', va='center')"
          ])
        }

        lines.add("plt.tight_layout(); plt.show()")

        if (prefs.showNormalizedConfusion) {
          lines.addAll(#[
            "plt.figure(figsize=(6, figure_height))",
            "plt.imshow(cm_norm, interpolation='nearest')",
            "plt.title('Normalized confusion matrix')",
            "plt.colorbar()",
            "tick_marks = np.arange(cm_norm.shape[0])",
            "plt.xticks(tick_marks, tick_marks)",
            "plt.yticks(tick_marks, tick_marks)",
            "plt.ylabel('True label')",
            "plt.xlabel('Predicted label')"
          ])

          if (prefs.annotateVisuals) {
            lines.addAll(#[
              "for ii in range(cm_norm.shape[0]):",
              "    for jj in range(cm_norm.shape[1]):",
              "        plt.text(jj, ii, format(cm_norm[ii, jj], '.' + str(metric_digits) + 'f'), ha='center', va='center')"
            ])
          }

          lines.add("plt.tight_layout(); plt.show()")
        }
      }
    }

    if (prefs.showClassificationReport()) {
      if (prefs.isMediumDetail) {
        lines.addAll(#[
          "print('Classification report:')",
          "print('Precision measures how often a predicted class is correct; recall measures how much of the true class is recovered; F1 balances both.')"
        ])
      } else if (prefs.isHighDetail) {
        lines.addAll(#[
          "print('Classification report:')",
          "print('Precision = proportion of predicted positives that are correct.')",
          "print('Recall = proportion of actual positives that are recovered.')",
          "print('F1-score = harmonic mean of precision and recall.')",
          "print('Support = number of test instances for the class.')"
        ])
      } else {
        lines.add("print('Classification report:')")
      }

      lines.add("print(classification_report(y_test, y_pred, digits=metric_digits))")
    }

    lines
  }

  def static String localPurposeIntro(UserPrefs prefs) {
    if (prefs.isLearningPurpose) {
      "This explanation is presented in a learning-oriented style to help understand one prediction."
    } else if (prefs.isJustificationPurpose) {
      "This explanation summarizes the main reasons behind the selected prediction."
    } else if (prefs.isDebuggingPurpose) {
      "This explanation focuses on a selected case to support debugging-oriented analysis."
    } else {
      "This explanation summarizes the most influential factors for the selected prediction."
    }
  }

  def static String globalPurposeIntro(UserPrefs prefs) {
    if (prefs.isLearningPurpose) {
      "This explanation is presented in a learning-oriented style to help understand the model globally."
    } else if (prefs.isJustificationPurpose) {
      "This explanation summarizes the main global reasons influencing the model overall."
    } else if (prefs.isDebuggingPurpose) {
      "This explanation complements debugging by highlighting global model behaviour."
    } else {
      "This explanation summarizes the model's behaviour at a global level."
    }
  }

  def static String visualTitle(String base, UserPrefs prefs) {
    if (prefs.isDebuggingPurpose) {
      base + " (debugging view)"
    } else if (prefs.isLearningPurpose) {
      base + " (learning view)"
    } else if (prefs.isJustificationPurpose) {
      base + " (justification view)"
    } else {
      base
    }
  }
}