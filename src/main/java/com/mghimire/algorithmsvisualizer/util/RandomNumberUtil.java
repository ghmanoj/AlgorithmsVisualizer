package com.mghimire.algorithmsvisualizer.util;

import java.util.Random;

public class RandomNumberUtil {
  private static final Random random = new Random();

  private RandomNumberUtil() {}

  public static int generateRandomNumberBetween(int a, int b) {
    return (int) (Math.abs(random.nextGaussian()) * Math.abs(a - b)  + a );
  }
}
