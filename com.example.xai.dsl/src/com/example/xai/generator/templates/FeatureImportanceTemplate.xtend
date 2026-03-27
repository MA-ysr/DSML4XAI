package com.example.xai.generator.templates

class FeatureImportanceTemplate {

  def String[] lines(UserPrefs prefs) {
    val lines = newArrayList
    lines.addAll(TemplateCommons.pythonPrelude(prefs, false))
    lines.addAll(TemplateCommons.preferenceHeader(prefs, "FeatureImportance", "global"))
    lines.addAll(TemplateCommons.debuggingDiagnostics(prefs))

    lines.addAll(#[
      "print('\\n[Feature Importance overview]')",
      "print('Feature importance is a global explanation: it ranks which features the model relies on most overall.')",
      "if hasattr(model, 'feature_importances_'):",
      "    importances = model.feature_importances_",
      "elif hasattr(model, 'coef_'):",
      "    coef = model.coef_",
      "    importances = np.abs(coef[0]) if getattr(coef, 'ndim', 1) > 1 else np.abs(coef)",
      "else:",
      "    from sklearn.inspection import permutation_importance",
      "    result = permutation_importance(model, X_test, y_test, n_repeats=5, random_state=0)",
      "    importances = result.importances_mean",
      "pairs = sorted(list(zip(HUMAN, importances)), key=lambda x: abs(float(x[1])), reverse=True)[:max_display]",
      "df_fi = pd.DataFrame({'Feature':[p[0] for p in pairs], 'Importance':[abs(float(p[1])) for p in pairs]})"
    ])

    if (prefs.hasFormat("plainText")) {
      lines.add("print('\\n[Plain-text explanation]')")
      lines.add("print(\"" + TemplateCommons.globalPurposeIntro(prefs) + "\")")
      if (prefs.isBeginner) {
        lines.addAll(#[
          "print('The following features matter most to the model overall.')",
          "for _, r in df_fi.iterrows():",
          "    print(' - ' + str(r['Feature']) + ': importance=' + format(r['Importance'], '.4f'))"
        ])
      } else if (prefs.isIntermediate) {
        lines.addAll(#[
          "for _, r in df_fi.iterrows():",
          "    print(' - ' + str(r['Feature']) + ': importance=' + format(r['Importance'], '.5f'))"
        ])
      } else {
        lines.addAll(#[
          "for _, r in df_fi.iterrows():",
          "    print(' - ' + str(r['Feature']) + ': importance=' + format(r['Importance'], '.6f'))"
        ])
      }
    }

    if (prefs.hasFormat("table")) {
      lines.add("print('\\n[Tabular explanation]')")
      if (prefs.isLowDetail) {
        lines.add("print('Columns: feature and global importance magnitude.')")
      } else if (prefs.isMediumDetail) {
        lines.add("print('Columns: feature and global importance magnitude, ordered from most influential to less influential.')")
      } else {
        lines.add("print('Columns: feature and global importance magnitude. Higher values indicate that the model relies more strongly on the feature overall.')")
      }
      lines.add("display(df_fi.head(table_rows))")
    }

    if (prefs.hasFormat("visual")) {
      lines.add("print('\\n[Visual explanation]')")
      if (prefs.isLowDetail) {
        lines.add("print('How to read the plot: longer bars indicate features that matter more to the model overall.')")
      } else if (prefs.isMediumDetail) {
        lines.add("print('How to read the plot: bar length encodes global importance. Compare bars to understand which features dominate the model behaviour.')")
      } else {
        lines.addAll(#[
          "print('How to read the plot: this is a global ranking of model reliance on features.')",
          "print('Use it to identify dominant features and compare the relative gap between the most and least influential ones shown.')"
        ])
      }

      lines.addAll(#[
        "plot_df = df_fi.sort_values('Importance')",
        "plt.figure(figsize=(8, figure_height))",
        "plt.barh(plot_df['Feature'], plot_df['Importance'])",
        "plt.title('" + TemplateCommons.visualTitle("Feature importance", prefs) + "')",
        "plt.xlabel('Importance')"
      ])

      if (prefs.showGrid) {
        lines.add("plt.grid(axis='x', alpha=0.2)")
      }

      if (prefs.annotateVisuals) {
        lines.addAll(#[
          "for idx, val in enumerate(plot_df['Importance']):",
          "    plt.text(val, idx, ' ' + format(val, '.4f'), va='center')"
        ])
      }

      lines.add("plt.tight_layout(); plt.show()")
    }

    lines.toArray(newArrayOfSize(lines.size))
  }
}
