package com.mghimire.algorithmsvisualizer.ui.layout;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ControlButtonLayout extends HBox {
  private final SortingAlgorithmHandler algorithmHandler;

  public ControlButtonLayout(SortingAlgorithmHandler algorithmHandler) {
    this.algorithmHandler = algorithmHandler;
    initLayout();
  }

  private void initLayout() {
    setSpacing(10);
    setPrefHeight(30);
    setAlignment(Pos.CENTER);

    var randomNumbersButton = new Button("Generate Random Number");
    var mergeSortButton = new Button("Merge Sort");
    var quickSortButton = new Button("Quick Sort");
    var bubbleSortButton = new Button("Bubble Sort");
    var insertionSortButton = new Button("Insertion Sort");

    getChildren().addAll(
      randomNumbersButton,
      mergeSortButton,
      quickSortButton,
      bubbleSortButton,
      insertionSortButton
    );

    randomNumbersButton.setOnAction(algorithmHandler::handleSetRandomNumber);
    mergeSortButton.setOnAction(algorithmHandler::handleMergeSort);
    quickSortButton.setOnAction(algorithmHandler::handleQuickSort);
    bubbleSortButton.setOnAction(algorithmHandler::handleBubbleSort);
    insertionSortButton.setOnAction(algorithmHandler::handleInsertionSort);
  }
}
