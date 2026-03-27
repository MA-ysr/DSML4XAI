package com.example.xai.generator

import java.util.ArrayList
import java.util.List

class GenerationReport {
  val String modelName
  val entries = new ArrayList<String>
  val warningMessages = new ArrayList<String>

  new(String modelName) {
    this.modelName = modelName
    info("Generation report created for model: " + modelName)
  }

  def void info(String message) {
    entries.add("[INFO] " + message)
  }

  def void warn(String message) {
    warningMessages.add(message)
    entries.add("[WARN] " + message)
  }

  def void error(String message) {
    entries.add("[ERROR] " + message)
  }

  def List<String> getWarnings() {
    warningMessages
  }

  def String render() {
    entries.join("\n") + "\n"
  }
}