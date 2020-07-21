package com.mghimire.algorithmsvisualizer.ui.layout;

import javafx.event.ActionEvent;

public interface SortingAlgorithmHandler {

  void handleSetRandomNumber(ActionEvent event);

  void handleMergeSort(ActionEvent event);

  void handleQuickSort(ActionEvent event);

  void handleInsertionSort(ActionEvent event);

  void handleBubbleSort(ActionEvent event);

}
