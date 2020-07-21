package com.mghimire.algorithmsvisualizer.sortingalgorithms;

public class MergeSort {

  private final int[] data;

  public MergeSort(int[] data) {
    if (data == null) throw new IllegalArgumentException("Data cannot be null");
    this.data = data;
  }

  public void sort() {
    mergeSort(0, data.length - 1);
  }

  private void mergeSort(int low, int high) {
    if (low < high) {
      int mid = (low + high) / 2;

      mergeSort(low, mid);
      mergeSort(mid+1, high);
      merge(low, mid, high);
    }
  }

  private void merge(int low, int mid, int high) {
    int[] left = new int[mid - low + 1];
    int[] right = new int[high - mid];

    for (int i = 0; i < left.length; i++) {
      left[i] = data[low+i];
    }
    for (int j = 0; j < right.length; j++) {
      right[j] = data[mid+j+1];
    }

    int i = 0, j = 0, k = low;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        data[k++] = left[i++];
      } else {
        data[k++] = right[j++];
      }
    }

    while (i < left.length) {
      data[k++] = left[i++];
    }

    while (j < right.length) {
      data[k++] = right[j++];
    }
  }

}
