# Evaluation Scenarios

This folder contains the datasets and executable test scenarios used to validate **DSML4XAI**.
Each scenario folder includes:

- an input DSML specification (`*.xai`)
- the generated Jupyter notebook (`*.ipynb`)
- an execution notebook with outputs preserved (`*_execution.ipynb`)
- a generation report (`*_generation_report.log`)

## Scope

The scenarios in this folder are **valid scenarios that satisfy the validator rules**. Cases that violate validation rules are intentionally excluded here because the generator is designed to stop before notebook generation when validation fails.

## Folder Structure

```text
evaluation-scenarios/
├── datasets/
└── scenarios/
    ├── scenario_1/
    ├── scenario_2/
    ├── ...
    └── scenario_11/
```

## Dataset Provenance

The datasets used in the scenarios come from official or canonical public sources.
Some files are direct downloads, while others are **derived exports** (e.g., CSV/JSON/PARQUET) produced from the same official source for dataset-type coverage.

| Dataset file(s) | Type(s) used | Provenance |
|---|---|---|
| `breast_cancer.csv`, `breast_cancer.parquet`, `breast_cancer.json` | CSV, PARQUET, JSON | Derived from the **Breast Cancer Wisconsin (Diagnostic)** dataset available through the official scikit-learn loader and originally sourced from UCI. Official reference: https://scikit-learn.org/stable/modules/generated/sklearn.datasets.load_breast_cancer.html |
| `banknote.csv` | CSV | Derived from the **Banknote Authentication** dataset from the UCI Machine Learning Repository. Official reference: https://archive.ics.uci.edu/dataset/267/banknote+authentication |
| `heart_scale` | LIBSVM | Directly taken from the official LIBSVM datasets page. Official reference: https://www.csie.ntu.edu.tw/~cjlin/libsvmtools/datasets/binary/heart_scale |

## Scenario Summary

Abbreviations used below:

- **B / I / A** = Beginner / Intermediate / Advanced
- **PT / TB / VS** = `plainText` / `table` / `visual`
- **def** = omitted in the DSML input and resolved through defaults
- **learn / debug / just / gen** = `learning` / `debugging` / `justification` / `general`

| Scenario | AI model | Dataset | User preferences (Exp / Formats / Details / Purpose) | Method (input → resolved) | Defaults applied | Generation time (ms) | Execution |
|---|---|---|---|---|---|---:|---|
| S1 | MLPClassifier | breast_cancer.csv (CSV) | B / [PT] / def / learn | auto→LIME | details | 4 | success |
| S2 | MLPClassifier | breast_cancer.csv (CSV) | A / [PT,VS] / med / debug | LIME | - | 4 | success |
| S3 | RandomForest | breast_cancer.csv (CSV) | I / [PT,TB,VS] / high / gen | FeatureImportance | - | 5 | success |
| S4 | LogisticRegression | banknote.csv (CSV) | A / [PT,TB,VS] / med / just | SHAP | - | 4 | success |
| S5 | DecisionTree | banknote.csv (CSV) | I / [PT,VS] / med / learn | PDP | - | 7 | success |
| S6 | KNN | breast_cancer.csv (CSV) | I / [PT,TB,VS] / med / gen | ICE | - | 17 | success |
| S7 | LogisticRegression | breast_cancer.csv (CSV) | B / def / def / def | auto→FeatureImportance | format, details, purpose | 5 | success |
| S8 | RandomForest | breast_cancer.csv (CSV) | A / [VS] / high / gen | auto→PDP | - | 3 | success |
| S9 | RandomForest | breast_cancer.parquet (PARQUET) | I / [PT,TB] / med / gen | FeatureImportance | - | 3 | success |
| S10 | DecisionTree | breast_cancer.json (JSON) | I / [PT] / def / learn | auto→PDP | details | 4 | success |
| S11 | SVM | heart_scale (LIBSVM) | I / [PT] / low / gen | LIME | - | 18 | success |

## How to Use the Scenarios

1. Open a scenario folder.
2. Inspect the `*.xai` file to see the input specification.
3. Inspect the generated notebook to see the notebook structure produced by the generator.
4. Open the `*_execution.ipynb` notebook to inspect the preserved outputs.
5. Inspect the `*_generation_report.log` file to review defaults, selected methods, required packages, and generation time.


## Notes

- Successful execution in this folder indicates that notebook generation completed and the resulting notebook was run with outputs preserved.
- Auto-selection behavior can be observed in scenarios where the explanation method is omitted (e.g., **S1**, **S7**, **S8**, **S10**).
- Dataset-type coverage is exercised through **CSV**, **PARQUET**, **JSON**, and **LIBSVM** scenarios.
