package com.example.xai.generator.templates

class LimeTemplate {

  def String[] lines(UserPrefs prefs) {
    val lines = newArrayList
    lines.addAll(TemplateCommons.pythonPrelude(prefs, true))
    lines.addAll(TemplateCommons.preferenceHeader(prefs, "LIME", "local"))
    lines.addAll(TemplateCommons.debuggingDiagnostics(prefs))

    lines.addAll(#[
      "print('\\n[LIME overview]')",
      "print('LIME explains one prediction by fitting a simple surrogate model around the selected instance.')",
      "import lime.lime_tabular",
      "explainer = lime.lime_tabular.LimeTabularExplainer(X_train, feature_names=HUMAN, class_names=['negative','positive'], mode='classification')",
      "exp = explainer.explain_instance(X_test[i], model.predict_proba, num_features=max_display)",
      "pairs = exp.as_list()",
      "def _parse(rule):",
      "    m = re.match(r'(.+?)\\s*(<=|>=|<|>)\\s*([-+]?\\d*\\.?\\d+(?:[eE][-+]?\\d+)?)', rule)",
      "    if not m:",
      "        return {'raw_rule': rule, 'feature_label': rule, 'cmp': '', 'thr': None}",
      "    left, cmp_op, thr = m.group(1).strip(), m.group(2), float(m.group(3))",
      "    try:",
      "        idx = HUMAN.index(left)",
      "        return {'raw_rule': rule, 'feature_label': HUMAN[idx], 'cmp': cmp_op, 'thr': thr}",
      "    except ValueError:",
      "        return {'raw_rule': rule, 'feature_label': left, 'cmp': cmp_op, 'thr': thr}",
      "parsed = []",
      "for text, w in pairs:",
      "    info = _parse(text)",
      "    info['weight'] = float(w)",
      "    info['direction'] = 'supports class 1' if float(w) > 0 else 'supports class 0'",
      "    info['abs_weight'] = abs(float(w))",
      "    parsed.append(info)",
      "parsed = sorted(parsed, key=lambda d: abs(d['weight']), reverse=True)[:max_display]",
      "df_lime = pd.DataFrame(parsed)"
    ])

    if (prefs.hasFormat("plainText")) {
      lines.add("print('\\n[Plain-text explanation]')")
      lines.add("print('" + TemplateCommons.localPurposeIntro(prefs) + "')")

      if (prefs.isBeginner) {
        lines.addAll(#[
          "print('How to read this explanation: each item below is a factor that pushes the prediction in one direction.')",
          "for _, r in df_lime.iterrows():",
          "    print(' - ' + str(r['feature_label']) + ': ' + str(r['direction']) + ' (strength=' + format(r['abs_weight'], '.4f') + ')')"
        ])
      } else if (prefs.isIntermediate) {
        lines.addAll(#[
          "for _, r in df_lime.iterrows():",
          "    print(' - ' + str(r['feature_label']) + ': ' + str(r['direction']) + ' | weight=' + format(r['weight'], '.4f'))"
        ])
      } else {
        lines.addAll(#[
          "for _, r in df_lime.iterrows():",
          "    print(' - rule=' + str(r['raw_rule']) + ' | weight=' + format(r['weight'], '.6f'))"
        ])
      }
    }

    if (prefs.hasFormat("table")) {
      lines.add("print('\\n[Tabular explanation]')")
      if (prefs.isLowDetail) {
        lines.add("print('Columns: feature label and direction of influence for the selected prediction.')")
        lines.add("display(df_lime[['feature_label','direction']].head(table_rows))")
      } else if (prefs.isMediumDetail) {
        lines.add("print('Columns: feature label, direction of influence, and signed local weight.')")
        lines.add("display(df_lime[['feature_label','direction','weight']].head(table_rows))")
      } else {
        lines.add("print('Columns: raw LIME rule, readable feature label, direction, signed weight, and absolute magnitude.')")
        lines.add("display(df_lime[['raw_rule','feature_label','direction','weight','abs_weight']].head(table_rows))")
      }
    }

    if (prefs.hasFormat("visual")) {
      lines.add("print('\\n[Visual explanation]')")

      if (prefs.isLowDetail) {
        lines.add("print('How to read the plot: longer bars indicate stronger local influence for the selected prediction.')")
      } else if (prefs.isMediumDetail) {
        lines.add("print('How to read the plot: bar length shows the magnitude of local influence; use the table/plain-text output for the direction of influence.')")
      } else {
        lines.addAll(#[
          "print('How to read the plot: this view shows the absolute strength of each local factor.')",
          "print('Use the signed weights in the table/plain-text output to determine whether a factor supports class 0 or class 1.')"
        ])
      }

      if (prefs.isDebuggingPurpose) {
        lines.add("print('Debugging note: interpret these factors together with the diagnostics above to understand why the selected case was difficult or incorrect.')")
      }

      lines.addAll(#[
        "plot_df = df_lime.sort_values('abs_weight')",
        "plt.figure(figsize=(8, figure_height))",
        "plt.barh(plot_df['feature_label'], plot_df['abs_weight'])",
        "plt.title('" + TemplateCommons.visualTitle("LIME local explanation", prefs) + "')",
        "plt.xlabel('Absolute local influence')"
      ])

      if (prefs.showGrid) {
        lines.add("plt.grid(axis='x', alpha=0.2)")
      }

      if (prefs.annotateVisuals) {
        lines.addAll(#[
          "for idx, val in enumerate(plot_df['abs_weight']):",
          "    plt.text(val, idx, ' ' + format(val, '.4f'), va='center')"
        ])
      }

      lines.add("plt.tight_layout(); plt.show()")
    }

    lines.toArray(newArrayOfSize(lines.size))
  }
}
