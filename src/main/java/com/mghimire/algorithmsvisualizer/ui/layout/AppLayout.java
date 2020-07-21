package com.mghimire.algorithmsvisualizer.ui.layout;

import com.mghimire.algorithmsvisualizer.sortingalgorithms.MergeSort;
import com.mghimire.algorithmsvisualizer.ui.model.ChartModel;
import com.mghimire.algorithmsvisualizer.ui.model.TitleProperty;
import com.mghimire.algorithmsvisualizer.util.RandomNumberUtil;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class AppLayout extends VBox implements SortingAlgorithmHandler {

  private static final int NUM_BARS = 40;
  private static final int BAR_GAP = 1;

  private final AppTitleLayout appTitleLayout;
  private final VisualizerLayout visualizerLayout;
  private final ControlButtonLayout controlButtonLayout;
  private final ChartModel chartModel;

  public AppLayout() {
    chartModel = new ChartModel();

    appTitleLayout = new AppTitleLayout();

    visualizerLayout = new VisualizerLayout(
      chartModel.getXAxis(),
      chartModel.getYAxis(),
      chartModel.getObservableList(),
      BAR_GAP
    );

    controlButtonLayout = new ControlButtonLayout(this);
    initLayout();
  }

  private void initLayout() {
    setSpacing(10);
    setPadding(new Insets(10));
    getChildren().addAll(appTitleLayout, visualizerLayout, controlButtonLayout);

    setVgrow(visualizerLayout, Priority.ALWAYS);
  }

  @Override
  public void handleSetRandomNumber(ActionEvent event) {
    var numberList = new ArrayList<Integer>();

    for (var i = 0; i < NUM_BARS; i++) {
      numberList.add(RandomNumberUtil.generateRandomNumberBetween(10, 1000));
    }

    appTitleLayout.clearTitleProperty();
    chartModel.setBarData(numberList);
  }

  @Override
  public void handleMergeSort(ActionEvent event) {

    ObservableList<XYChart.Series<String, Number>> observableList = chartModel.getObservableList();
    if (observableList.size() > 0) {
      var titleProperty = new TitleProperty(
        "Merge Sort",
        "O(n log n)",
        "О(n) "
      );
      appTitleLayout.setTitleProperty(titleProperty);

      ObservableList<XYChart.Data<String, Number>> dataList = observableList.get(0).getData();
      int[] numberArray = new int[dataList.size()];

      for (int i = 0; i < dataList.size(); i++) {
        numberArray[i] = dataList.get(i).getYValue().intValue();
      }

      var mergeSort = new MergeSort(numberArray);
      mergeSort.sort();

      var sortedDataList = new ArrayList<Integer>();
      for (int value : numberArray) {
        sortedDataList.add(value);
      }

      chartModel.setBarData(sortedDataList);
    }
  }

  @Override
  public void handleQuickSort(ActionEvent event) {

  }

  @Override
  public void handleInsertionSort(ActionEvent event) {

  }

  @Override
  public void handleBubbleSort(ActionEvent event) {

  }
}
