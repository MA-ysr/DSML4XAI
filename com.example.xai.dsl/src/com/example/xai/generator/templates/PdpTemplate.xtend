package com.example.xai.generator.templates

class PdpTemplate {

  def String[] lines(UserPrefs prefs) {
    val lines = newArrayList
    lines.addAll(TemplateCommons.pythonPrelude(prefs, false))
    lines.addAll(TemplateCommons.preferenceHeader(prefs, "PDP", "global"))
    lines.addAll(TemplateCommons.debuggingDiagnostics(prefs))

    lines.addAll(#[
      "print('\\n[PDP overview]')",
      "print('Partial dependence shows the average effect of a feature on the model prediction.')",
      "feat_idx = 0",
      "xs = X_train[:, feat_idx]",
      "grid = np.linspace(np.min(xs), np.max(xs), num=curve_resolution)",
      "preds = []",
      "for g in grid:",
      "    X_tmp = X_train.copy()",
      "    X_tmp[:, feat_idx] = g",
      "    if hasattr(model, 'predict_proba'):",
      "        preds.append(float(np.mean(model.predict_proba(X_tmp)[:,1])))",
      "    else:",
      "        preds.append(float(np.mean(model.predict(X_tmp))))",
      "df_pdp = pd.DataFrame({'Feature':[HUMAN[feat_idx]]*len(grid), 'Value':grid, 'AveragePrediction':preds})",
      "start_pred = float(df_pdp['AveragePrediction'].iloc[0])",
      "end_pred = float(df_pdp['AveragePrediction'].iloc[-1])",
      "delta_pred = end_pred - start_pred",
      "if delta_pred > 0.01:",
      "    trend_label = 'overall increasing'",
      "elif delta_pred < -0.01:",
      "    trend_label = 'overall decreasing'",
      "else:",
      "    trend_label = 'mostly stable'",
      "sample_idx = np.unique(np.linspace(0, len(df_pdp)-1, num=min(pdp_sample_rows, len(df_pdp))).astype(int))",
      "df_pdp_view = df_pdp.iloc[sample_idx].copy()",
      "df_pdp_view['DeltaFromStart'] = df_pdp_view['AveragePrediction'] - start_pred"
    ])

    if (prefs.hasFormat("plainText")) {
      lines.add("print('\\n[Plain-text explanation]')")
      lines.add("print(\"" + TemplateCommons.globalPurposeIntro(prefs) + "\")")
      lines.add("print('Feature under analysis: ' + HUMAN[feat_idx])")

      if (prefs.isLowDetail) {
        lines.addAll(#[
          "print('How to read this explanation: the x-axis represents sampled values of the selected feature; the y-axis represents the average model prediction when that feature is set to those values.')",
          "print('Overall trend: ' + trend_label)"
        ])
      } else if (prefs.isMediumDetail) {
        lines.addAll(#[
          "print('How to read this explanation: each point summarizes the average prediction obtained when the selected feature is forced to a given value across the data.')",
          "print('Overall trend: ' + trend_label)",
          "print('Start prediction: ' + format(start_pred, '.4f'))",
          "print('End prediction:   ' + format(end_pred, '.4f'))"
        ])
      } else {
        lines.addAll(#[
          "print('How to read this explanation: PDP averages out the effect of the other features, so the curve isolates the marginal influence of one feature on the prediction.')",
          "print('Overall trend: ' + trend_label)",
          "print('Minimum average prediction: ' + format(float(df_pdp['AveragePrediction'].min()), '.4f'))",
          "print('Maximum average prediction: ' + format(float(df_pdp['AveragePrediction'].max()), '.4f'))",
          "print('Net change between the first and last sampled values: ' + format(delta_pred, '.4f'))"
        ])
      }
    }

    if (prefs.hasFormat("table")) {
      lines.add("print('\\n[Tabular explanation]')")
      if (prefs.isLowDetail) {
        lines.add("print('Columns: sampled feature value and corresponding average prediction.')")
        lines.add("display(df_pdp_view[['Value','AveragePrediction']].head(table_rows))")
      } else if (prefs.isMediumDetail) {
        lines.add("print('Columns: sampled feature value, average prediction, and change relative to the first sampled point.')")
        lines.add("display(df_pdp_view[['Value','AveragePrediction','DeltaFromStart']].head(table_rows))")
      } else {
        lines.addAll(#[
          "print('Columns: sampled feature value, average prediction, and change relative to the first sampled point.')",
          "print('Positive DeltaFromStart means the average prediction is above the first sampled point; negative values mean it is below.')"
        ])
        lines.add("display(df_pdp_view[['Feature','Value','AveragePrediction','DeltaFromStart']].head(table_rows))")
      }
    }

    if (prefs.hasFormat("visual")) {
      lines.add("print('\\n[Visual explanation]')")
      if (prefs.isLowDetail) {
        lines.add("print('How to read the plot: follow the curve from left to right to see whether the average prediction increases, decreases, or stays stable as the feature changes.')")
      } else if (prefs.isMediumDetail) {
        lines.add("print('How to read the plot: the x-axis is the sampled feature value and the y-axis is the average model prediction. The slope indicates how sensitive the model is to this feature.')")
      } else {
        lines.addAll(#[
          "print('How to read the plot: PDP is a global explanation. It averages over the remaining features to isolate the marginal effect of the selected feature.')",
          "print('Look for increasing, decreasing, or flat regions to understand how the model response changes across the feature range.')"
        ])
      }

      lines.addAll(#[
        "plt.figure(figsize=(8, figure_height))",
        "plt.plot(df_pdp['Value'], df_pdp['AveragePrediction'], linewidth=line_width)",
        "plt.title('" + TemplateCommons.visualTitle("Partial dependence", prefs) + "')",
        "plt.xlabel(HUMAN[feat_idx])",
        "plt.ylabel('Average prediction')"
      ])

      if (prefs.showGrid) {
        lines.add("plt.grid(alpha=0.2)")
      }

      if (!prefs.isLowDetail) {
        lines.addAll(#[
          "plt.scatter([df_pdp['Value'].iloc[0], df_pdp['Value'].iloc[len(df_pdp)-1]],[start_pred, end_pred])"
        ])
      }

      if (prefs.isHighDetail) {
        lines.addAll(#[
          "min_idx = int(np.argmin(df_pdp['AveragePrediction'].values))",
          "max_idx = int(np.argmax(df_pdp['AveragePrediction'].values))",
          "plt.scatter([df_pdp['Value'].iloc[min_idx], df_pdp['Value'].iloc[max_idx]],[df_pdp['AveragePrediction'].iloc[min_idx], df_pdp['AveragePrediction'].iloc[max_idx]])",
          "baseline = float(np.mean(df_pdp['AveragePrediction'].values))",
          "plt.axhline(baseline, linestyle='--', linewidth=1.0)"
        ])
      }

      lines.add("plt.tight_layout(); plt.show()")
    }

    lines.toArray(newArrayOfSize(lines.size))
  }
}
