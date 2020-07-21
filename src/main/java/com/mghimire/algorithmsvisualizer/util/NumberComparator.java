package com.mghimire.algorithmsvisualizer.util;

public class NumberComparator {
  private NumberComparator() {

  }

  public static int compare(Number n1, Number n2) {
    return n1.intValue() - n2.intValue();
  }

}
