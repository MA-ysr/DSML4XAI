package com.example.xai.generator.templates

class ShapTemplate {

  def String[] lines(UserPrefs prefs) {
    val lines = newArrayList
    lines.addAll(TemplateCommons.pythonPrelude(prefs, true))
    lines.addAll(TemplateCommons.preferenceHeader(prefs, "SHAP", "local+global"))
    lines.addAll(TemplateCommons.debuggingDiagnostics(prefs))

    lines.addAll(#[
      "print('\\n[SHAP overview]')",
      "print('SHAP assigns additive feature attributions to explain a prediction.')",
      "import shap",
      "background = X_train[:min(50, X_train.shape[0])]",
      "if hasattr(model, 'predict_proba'):",
      "    predict_fn = lambda X: model.predict_proba(np.array(X))",
      "else:",
      "    predict_fn = lambda X: np.array(model.predict(np.array(X))).reshape(-1, 1)",
      "explainer = shap.Explainer(predict_fn, background)",
      "X_one = X_test[i:i+1]",
      "sv_one = explainer(X_one)",
      "def _flatten_local(values):",
      "    arr = np.array(values)",
      "    if arr.ndim == 1:",
      "        return arr",
      "    if arr.ndim == 2:",
      "        return arr[0]",
      "    if arr.ndim == 3:",
      "        class_idx = 1 if arr.shape[2] > 1 else 0",
      "        return arr[0, :, class_idx]",
      "    return arr.reshape(-1)",
      "vals = _flatten_local(sv_one.values)",
      "pairs = list(zip(HUMAN, vals))",
      "pairs = sorted(pairs, key=lambda x: abs(float(x[1])), reverse=True)[:max_display]",
      "df_shap = pd.DataFrame({'Feature':[p[0] for p in pairs], 'SHAP':[float(p[1]) for p in pairs]})",
      "df_shap['AbsSHAP'] = df_shap['SHAP'].abs()"
    ])

    if (prefs.hasFormat("plainText")) {
      lines.add("print('\\n[Plain-text explanation]')")
      lines.add("print('" + TemplateCommons.localPurposeIntro(prefs) + "')")

      if (prefs.isBeginner) {
        lines.addAll(#[
          "for _, r in df_shap.iterrows():",
          "    direction = 'pushes UP' if r['SHAP'] > 0 else 'pushes DOWN'",
          "    print(' - ' + str(r['Feature']) + ': ' + direction + ' (strength=' + format(r['AbsSHAP'], '.4f') + ')')"
        ])
      } else if (prefs.isIntermediate) {
        lines.addAll(#[
          "for _, r in df_shap.iterrows():",
          "    print(' - ' + str(r['Feature']) + ': SHAP=' + format(r['SHAP'], '.4f'))"
        ])
      } else {
        lines.addAll(#[
          "for _, r in df_shap.iterrows():",
          "    print(' - ' + str(r['Feature']) + ': SHAP=' + format(r['SHAP'], '.6f') + ' | abs=' + format(r['AbsSHAP'], '.6f'))"
        ])
      }
    }

    if (prefs.hasFormat("table")) {
      lines.add("print('\\n[Tabular explanation]')")
      if (prefs.isLowDetail) {
        lines.add("print('Columns: feature and signed SHAP value for the selected prediction.')")
        lines.add("display(df_shap[['Feature','SHAP']].head(table_rows))")
      } else {
        lines.add("print('Columns: feature, signed SHAP value, and absolute magnitude.')")
        lines.add("display(df_shap[['Feature','SHAP','AbsSHAP']].head(table_rows))")
      }
    }

    if (prefs.hasFormat("visual")) {
      lines.add("print('\\n[Visual explanation]')")

      if (prefs.isLowDetail) {
        lines.add("print('How to read the plot: longer bars indicate stronger local influence for the selected prediction.')")
      } else if (prefs.isMediumDetail) {
        lines.add("print('How to read the plot: bar length shows the magnitude of SHAP influence; signed values in the table/plain-text output show the direction.')")
      } else {
        lines.addAll(#[
          "print('How to read the plot: the bar chart shows absolute SHAP magnitude for the selected prediction.')",
          "print('Use the signed SHAP values from the table/plain-text output to determine whether a feature pushes the prediction up or down.')"
        ])
      }

      lines.addAll(#[
        "plot_df = df_shap.sort_values('AbsSHAP')",
        "plt.figure(figsize=(8, figure_height))",
        "plt.barh(plot_df['Feature'], plot_df['AbsSHAP'])",
        "plt.title('" + TemplateCommons.visualTitle("SHAP local explanation", prefs) + "')",
        "plt.xlabel('|SHAP value|')"
      ])

      if (prefs.showGrid) {
        lines.add("plt.grid(axis='x', alpha=0.2)")
      }

      if (prefs.annotateVisuals) {
        lines.addAll(#[
          "for idx, val in enumerate(plot_df['AbsSHAP']):",
          "    plt.text(val, idx, ' ' + format(val, '.4f'), va='center')"
        ])
      }

      lines.add("plt.tight_layout(); plt.show()")

      if (prefs.isHighDetail) {
        lines.addAll(#[
          "print('\\n[Global SHAP summary]')",
          "try:",
          "    n = min(100, X_test.shape[0])",
          "    sv_many = explainer(X_test[:n])",
          "    arr = np.array(sv_many.values)",
          "    if arr.ndim == 3:",
          "        class_idx = 1 if arr.shape[2] > 1 else 0",
          "        arr = arr[:, :, class_idx]",
          "    elif arr.ndim == 2:",
          "        arr = arr",
          "    else:",
          "        arr = arr.reshape(1, -1)",
          "    mean_abs = np.mean(np.abs(arr), axis=0)",
          "    df_shap_global = pd.DataFrame({'Feature': HUMAN, 'MeanAbsSHAP': mean_abs}).sort_values('MeanAbsSHAP', ascending=False).head(max_display)",
          "    print('Interpretation: this summary aggregates absolute SHAP influence across sampled test cases to identify globally important features.')",
          "    display(df_shap_global)",
          "    plt.figure(figsize=(8, figure_height))",
          "    gplot_df = df_shap_global.sort_values('MeanAbsSHAP')",
          "    plt.barh(gplot_df['Feature'], gplot_df['MeanAbsSHAP'])",
          "    plt.title('Global SHAP summary')",
          "    plt.xlabel('Mean |SHAP value|')",
          "    if True:",
          "        plt.grid(axis='x', alpha=0.2)",
          "    plt.tight_layout(); plt.show()",
          "except Exception as e:",
          "    print('Global SHAP summary not available: ' + str(e))"
        ])
      }
    }

    lines.toArray(newArrayOfSize(lines.size))
  }
}
