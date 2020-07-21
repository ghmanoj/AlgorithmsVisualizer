package com.mghimire.algorithmsvisualizer.ui.layout;

import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

public class VisualizerLayout extends BarChart<String, Number> {
  private final CategoryAxis xAxis;
  private final NumberAxis yAxis;
  public VisualizerLayout(
    CategoryAxis xAxis,
    NumberAxis yAxis,
    ObservableList<Series<String, Number>> data,
    double categoryGap
  ) {
    super(xAxis, yAxis, data, categoryGap);
    this.xAxis = xAxis;
    this.yAxis = yAxis;
    initChartProperties();
  }

  private void initChartProperties() {

    setAnimated(false);
    setLegendVisible(false);

    xAxis.setAnimated(false);
    xAxis.setTickLabelsVisible(false);
    xAxis.setTickMarkVisible(false);
    xAxis.setVisible(false);
    xAxis.setOpacity(0);

    yAxis.setAnimated(false);
    yAxis.setTickMarkVisible(false);
    yAxis.setTickLabelsVisible(false);
    yAxis.setVisible(false);
    yAxis.setOpacity(0);

    setVerticalGridLinesVisible(false);
    setVerticalZeroLineVisible(false);
    setHorizontalGridLinesVisible(false);
    setHorizontalZeroLineVisible(false);
  }
}
