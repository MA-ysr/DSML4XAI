package com.example.xai.generator

import java.util.ArrayList

class NotebookBuilder {
  val cells = new ArrayList<String>

  def addMarkdown(String... lines) {
    val content = lines.map[escape(it)].join(",\n        ")
    val json = '''
      {
        "cell_type": "markdown",
        "metadata": {},
        "source": [
        «content»
        ]
      }
    '''
    cells.add(json)
  }

  def addCode(String... lines) {
    val content = lines.map[escape(it)].join(",\n        ")
    val json = '''
      {
        "cell_type": "code",
        "metadata": {},
        "source": [
        «content»
        ]
      }
    '''
    cells.add(json)
  }

  def build() {
    val body = cells.join(",\n")
    '''
    {
      "cells": [
      «body»
      ],
      "metadata": {},
      "nbformat": 4,
      "nbformat_minor": 2
    }
    '''
  }

  /** Escape a single source line as a JSON string element */
  def private escape(String s) {
    '"' + s.replace("\\", "\\\\").replace("\"", "\\\"") + '\\n"'
  }
}
