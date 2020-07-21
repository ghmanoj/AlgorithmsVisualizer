package com.mghimire.algorithmsvisualizer.ui.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.util.List;

public class ChartModel {
  private final CategoryAxis xAxis;
  private final NumberAxis yAxis;
  private final ObservableList<XYChart.Series<String, Number>> observableList;

  public ChartModel() {
    xAxis = new CategoryAxis();
    yAxis = new NumberAxis();
    observableList = FXCollections.observableArrayList();
  }

  public CategoryAxis getXAxis() {
    return xAxis;
  }

  public NumberAxis getYAxis() {
    return yAxis;
  }

  public ObservableList<XYChart.Series<String, Number>> getObservableList() {
    return observableList;
  }

  public void setBarData(List<Integer> numberList) {
    ObservableList<XYChart.Data<String, Number>> data = FXCollections.observableArrayList();

    var series = new XYChart.Series<String, Number>();

    for (int number : numberList) {
      data.add(new XYChart.Data<>(String.valueOf(System.nanoTime()), number));
    }

    series.setData(data);

    observableList.clear();
    observableList.add(series);
  }

}
