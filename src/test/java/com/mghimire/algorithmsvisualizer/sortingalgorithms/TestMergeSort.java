package com.mghimire.algorithmsvisualizer.sortingalgorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMergeSort {

  @Test
  public void testSort() {
    int[] testData = {-10, 30, 20, 11, 33, -10};
    int[] validData = {-10, -10, 11, 20, 30, 33};

    var mergeSort = new MergeSort(testData);
    mergeSort.sort();

    assertArrayEquals(validData, testData, "Arrays should be equal");
  }

  @Test
  public void testInvalidData() {
    int[] invalidData = null;

    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
      () -> new MergeSort(invalidData),
      "Expected new MergeSort(null) to throw exception but did not"
    );

    assertTrue(exception.getMessage().contains("Data cannot be null"));
  }
}
