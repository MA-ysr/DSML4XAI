package com.example.xai.generator.templates

import java.util.List

class UserPrefs {
  public val String expertise
  public val List<String> formats
  public val String purpose
  public val String details
  public val int detailsRank
  public val List<String> debugTechniques

  public val boolean expertiseDefaulted
  public val boolean formatDefaulted
  public val boolean purposeDefaulted
  public val boolean detailsDefaulted

  new(String expertise, List<String> formats, String purpose, String details, int detailsRank,
      List<String> debugTechniques,
      boolean expertiseDefaulted, boolean formatDefaulted,
      boolean purposeDefaulted, boolean detailsDefaulted) {
    this.expertise = expertise
    this.formats = newArrayList
    if (formats !== null) {
      this.formats.addAll(formats)
    }
    this.purpose = purpose
    this.details = details
    this.detailsRank = detailsRank
    this.debugTechniques = newArrayList
    if (debugTechniques !== null) {
      this.debugTechniques.addAll(debugTechniques)
    }
    this.expertiseDefaulted = expertiseDefaulted
    this.formatDefaulted = formatDefaulted
    this.purposeDefaulted = purposeDefaulted
    this.detailsDefaulted = detailsDefaulted
  }

  def boolean isBeginner() {
    expertise !== null && expertise.equalsIgnoreCase("Beginner")
  }

  def boolean isIntermediate() {
    expertise !== null && expertise.equalsIgnoreCase("Intermediate")
  }

  def boolean isAdvanced() {
    expertise !== null && expertise.equalsIgnoreCase("Advanced")
  }

  def boolean isDebuggingPurpose() {
    purpose !== null && purpose.equalsIgnoreCase("debugging")
  }

  def boolean isLearningPurpose() {
    purpose !== null && purpose.equalsIgnoreCase("learning")
  }

  def boolean isJustificationPurpose() {
    purpose !== null && purpose.equalsIgnoreCase("justification")
  }

  def boolean isGeneralPurpose() {
    purpose !== null && purpose.equalsIgnoreCase("general")
  }

  def boolean isLowDetail() {
    detailsRank <= 1
  }

  def boolean isMediumDetail() {
    detailsRank == 2
  }

  def boolean isHighDetail() {
    detailsRank >= 3
  }

  def boolean hasFormat(String name) {
    if (name === null) return false
    formats.exists[it.equalsIgnoreCase(name.trim)]
  }

  def boolean hasDebugTechnique(String name) {
    if (name === null) return false
    debugTechniques.exists[it.equalsIgnoreCase(name.trim)]
  }

  def String formatSummary() {
    if (formats.empty) "[]" else "[" + formats.join(", ") + "]"
  }

  /**
   * Internal rendering limits derived from DetailsLevel.rank.
   * These are implementation details, not first-class DSL concepts.
   */
  def int maxDisplay() {
    switch detailsRank {
      case 1: 3
      case 2: 6
      default: 10
    }
  }

  def int tableRows() {
    switch detailsRank {
      case 1: 6
      case 2: 10
      default: 14
    }
  }

  def int curveResolution() {
    switch detailsRank {
      case 1: 12
      case 2: 24
      default: 40
    }
  }

  def int iceInstances() {
    switch detailsRank {
      case 1: 5
      case 2: 10
      default: 20
    }
  }

  def int metricDigits() {
    switch detailsRank {
      case 1: 2
      case 2: 4
      default: 6
    }
  }

  def double figureHeight() {
    switch detailsRank {
      case 1: 3.8
      case 2: 4.6
      default: 5.4
    }
  }

  def double lineWidth() {
    switch detailsRank {
      case 1: 1.5
      case 2: 2.0
      default: 2.6
    }
  }

  def int pdpSampleRows() {
    switch detailsRank {
      case 1: 6
      case 2: 8
      default: 10
    }
  }

  def int iceDetailedInstances() {
    switch detailsRank {
      case 1: 2
      case 2: 3
      default: 5
    }
  }

  def int sampledCurvePoints() {
    switch detailsRank {
      case 1: 5
      case 2: 7
      default: 10
    }
  }

  def boolean showGrid() {
    !isLowDetail
  }

  def boolean annotateVisuals() {
    isHighDetail
  }

  def boolean showClassificationReport() {
    !isLowDetail && hasDebugTechnique("ClassificationReport")
  }

  def boolean showNormalizedConfusion() {
    !isLowDetail && hasDebugTechnique("ConfusionMatrix")
  }

  def boolean showErrorCount() {
    isHighDetail && hasDebugTechnique("ConfusionMatrix")
  }

  def boolean showSelectionReason() {
    !isLowDetail
  }
}