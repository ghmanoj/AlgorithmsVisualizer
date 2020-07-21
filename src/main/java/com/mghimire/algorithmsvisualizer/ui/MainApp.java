package com.mghimire.algorithmsvisualizer.ui;

import com.mghimire.algorithmsvisualizer.ui.layout.AppLayout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
  private static final int WIDTH = 800;
  private static final int HEIGHT = 600;
  private static final String CHART_STYLES = "/stylesheet/style.css";
  private static final String BOOTSTRAP3_STYLESHEET = "/stylesheet/bootstrap3.css";

  @Override
  public void start(Stage stage) throws Exception {

    var rootLayout = new AppLayout();

    var scene = new Scene(rootLayout, WIDTH, HEIGHT);

    scene.getStylesheets().add(getClass().getResource(BOOTSTRAP3_STYLESHEET).toString());
    scene.getStylesheets().add(getClass().getResource(CHART_STYLES).toString());

    stage.setScene(scene);
    stage.setTitle("Algorithms Visualizer Application");
    stage.setResizable(false);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
