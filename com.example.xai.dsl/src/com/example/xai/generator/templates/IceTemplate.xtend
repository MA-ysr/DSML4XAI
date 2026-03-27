package com.example.xai.generator.templates

class IceTemplate {

  def String[] lines(UserPrefs prefs) {
    val lines = newArrayList
    lines.addAll(TemplateCommons.pythonPrelude(prefs, false))
    lines.addAll(TemplateCommons.preferenceHeader(prefs, "ICE", "global"))
    lines.addAll(TemplateCommons.debuggingDiagnostics(prefs))

    lines.addAll(#[
      "print('\\n[ICE overview]')",
      "print('ICE shows how the prediction changes for individual instances as one feature varies.')",
      "feat_idx = 0",
      "xs = X_train[:, feat_idx]",
      "grid = np.linspace(np.min(xs), np.max(xs), num=curve_resolution)",
      "n_instances = min(ice_instances, X_test.shape[0])",
      "summary_rows = []",
      "point_rows = []",
      "sample_idx = np.unique(np.linspace(0, len(grid)-1, num=min(sampled_curve_points, len(grid))).astype(int))",
      "for inst in range(n_instances):",
      "    base = X_test[inst].copy()",
      "    preds = []",
      "    for g in grid:",
      "        x = base.copy()",
      "        x[feat_idx] = g",
      "        if hasattr(model, 'predict_proba'):",
      "            preds.append(float(model.predict_proba([x])[0][1]))",
      "        else:",
      "            preds.append(float(model.predict([x])[0]))",
      "    pred_arr = np.array(preds, dtype=float)",
      "    summary_rows.append({'Instance': inst, 'Feature': HUMAN[feat_idx], 'StartPrediction': float(pred_arr[0]), 'EndPrediction': float(pred_arr[-1]), 'MinPrediction': float(pred_arr.min()), 'MaxPrediction': float(pred_arr.max()), 'Variation': float(pred_arr.max() - pred_arr.min())})",
      "    if inst < ice_detailed_instances:",
      "        for pos in sample_idx:",
      "            point_rows.append({'Instance': inst, 'FeatureValue': float(grid[pos]), 'Prediction': float(pred_arr[pos])})",
      "df_ice_summary = pd.DataFrame(summary_rows)",
      "df_ice_points = pd.DataFrame(point_rows)"
    ])

    if (prefs.hasFormat("plainText")) {
      lines.add("print('\\n[Plain-text explanation]')")
      lines.add("print(\"" + TemplateCommons.globalPurposeIntro(prefs) + "\")")
      lines.add("print('Feature under analysis: ' + HUMAN[feat_idx])")

      if (prefs.isLowDetail) {
        lines.addAll(#[
          "print('How to read this explanation: in the visual plot, each line corresponds to one test instance.')",
          "print('The x-axis is the sampled feature value and the y-axis is the resulting prediction for that instance.')"
        ])
      } else if (prefs.isMediumDetail) {
        lines.addAll(#[
          "print('How to read this explanation: ICE reveals whether different instances react similarly or differently when the selected feature changes.')",
          "print('Large separation between lines suggests heterogeneous behaviour across instances.')",
          "print('Number of sampled instances: ' + str(n_instances))"
        ])
      } else {
        lines.addAll(#[
          "print('How to read this explanation: ICE complements PDP by exposing instance-level trajectories instead of only the average effect.')",
          "print('If the curves are parallel, the feature effect is relatively consistent; if they diverge or cross, the effect varies across instances.')",
          "print('Number of sampled instances: ' + str(n_instances))"
        ])
      }
    }

    if (prefs.hasFormat("table")) {
      lines.add("print('\\n[Tabular explanation]')")
      if (prefs.isLowDetail) {
        lines.add("print('Summary columns: start prediction, end prediction, and total variation for each sampled instance.')")
        lines.add("display(df_ice_summary[['Instance','Feature','StartPrediction','EndPrediction','Variation']].head(table_rows))")
      } else if (prefs.isMediumDetail) {
        lines.add("print('Summary columns: start/end predictions, minimum/maximum prediction, and total variation for each sampled instance.')")
        lines.add("display(df_ice_summary[['Instance','Feature','StartPrediction','EndPrediction','MinPrediction','MaxPrediction','Variation']].head(table_rows))")
      } else {
        lines.addAll(#[
          "print('Summary table: one row per sampled instance, showing how much the prediction changes as the selected feature moves across its range.')",
          "print('Detailed sample table: a few sampled feature values and their corresponding predictions for the first instances.')"
        ])
        lines.add("display(df_ice_summary[['Instance','Feature','StartPrediction','EndPrediction','MinPrediction','MaxPrediction','Variation']].head(table_rows))")
        lines.add("display(df_ice_points.head(table_rows))")
      }
    }

    if (prefs.hasFormat("visual")) {
      lines.add("print('\\n[Visual explanation]')")
      if (prefs.isLowDetail) {
        lines.add("print('How to read the plot: each line is one instance. Follow a line from left to right to see how that instance reacts when the selected feature changes.')")
      } else if (prefs.isMediumDetail) {
        lines.add("print('How to read the plot: line separation indicates whether the feature effect is stable across instances or varies from case to case.')")
      } else {
        lines.addAll(#[
          "print('How to read the plot: ICE exposes instance-level heterogeneity. Parallel curves indicate similar effects, while diverging or crossing curves indicate interaction or heterogeneous sensitivity.')",
          "print('The dashed average curve provides a global reference over the individual trajectories.')"
        ])
      }

      lines.addAll(#[
        "plt.figure(figsize=(8, figure_height))",
        "detail_alpha = 0.55 if n_instances <= 8 else 0.35",
        "for inst in range(n_instances):",
        "    row = df_ice_points[df_ice_points['Instance'] == inst]",
        "for idx in range(n_instances):",
        "    # plotting from recomputed summaries is easier using the original loop again",
        "    pass"
      ])

      lines.addAll(#[
        "plt.figure(figsize=(8, figure_height))",
        "for inst in range(n_instances):",
        "    base = X_test[inst].copy()",
        "    preds = []",
        "    for g in grid:",
        "        x = base.copy()",
        "        x[feat_idx] = g",
        "        if hasattr(model, 'predict_proba'):",
        "            preds.append(float(model.predict_proba([x])[0][1]))",
        "        else:",
        "            preds.append(float(model.predict([x])[0]))",
        "    plt.plot(grid, preds, linewidth=line_width, alpha=0.35 if n_instances > 8 else 0.6)",
        "plt.title('" + TemplateCommons.visualTitle("ICE plot", prefs) + "')",
        "plt.xlabel(HUMAN[feat_idx])",
        "plt.ylabel('Prediction')"
      ])

      if (prefs.isHighDetail) {
        lines.addAll(#[
          "avg_curves = []",
          "for inst in range(n_instances):",
          "    base = X_test[inst].copy()",
          "    preds = []",
          "    for g in grid:",
          "        x = base.copy()",
          "        x[feat_idx] = g",
          "        if hasattr(model, 'predict_proba'):",
          "            preds.append(float(model.predict_proba([x])[0][1]))",
          "        else:",
          "            preds.append(float(model.predict([x])[0]))",
          "    avg_curves.append(preds)",
          "avg_curve = np.mean(np.array(avg_curves), axis=0)",
          "plt.plot(grid, avg_curve, linewidth=line_width + 0.8, linestyle='--')"
        ])
      }

      if (prefs.showGrid) {
        lines.add("plt.grid(alpha=0.2)")
      }

      lines.add("plt.tight_layout(); plt.show()")
    }

    lines.toArray(newArrayOfSize(lines.size))
  }
}
