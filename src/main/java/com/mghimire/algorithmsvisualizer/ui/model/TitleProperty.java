package com.mghimire.algorithmsvisualizer.ui.model;

public class TitleProperty {
  private final String algorithm;
  private final String worstTime;
  private final String space;

  public TitleProperty(String algorithm, String worstTime, String space) {
    this.algorithm = algorithm;
    this.worstTime = worstTime;
    this.space = space;
  }

  public String getAlgorithm() {
    return algorithm;
  }

  public String getWorstTime() {
    return worstTime;
  }

  public String getSpace() {
    return space;
  }
}
