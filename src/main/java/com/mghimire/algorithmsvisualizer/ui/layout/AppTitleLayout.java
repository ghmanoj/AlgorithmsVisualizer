package com.mghimire.algorithmsvisualizer.ui.layout;

import com.mghimire.algorithmsvisualizer.ui.model.TitleProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class AppTitleLayout extends HBox {
  private final Label titleLabel;
  private final Label timeComplexityLabel;
  private final Label spaceComplexityLabel;

  private static final Font fontLarge = new Font(20);
  private static final Font detailFonts = new Font(15);

  public AppTitleLayout() {
    setHeight(40);
    setAlignment(Pos.CENTER);
    setSpacing(20);
    setPadding(new Insets(0, 0, 0, 0));

    VBox complexityBox = new VBox();
    complexityBox.setSpacing(5);

    titleLabel = new Label();
    titleLabel.setFont(fontLarge);

    timeComplexityLabel = new Label();
    timeComplexityLabel.setFont(detailFonts);
    spaceComplexityLabel = new Label();
    spaceComplexityLabel.setFont(detailFonts);
    complexityBox.getChildren().addAll(timeComplexityLabel, spaceComplexityLabel);

    getChildren().addAll(titleLabel, complexityBox);
  }

  public void setTitleProperty(TitleProperty titleProperty) {
    titleLabel.setText(titleProperty.getAlgorithm());

    timeComplexityLabel.setText("Worst time: " + titleProperty.getWorstTime());
    spaceComplexityLabel.setText("Worst space: " + titleProperty.getSpace());
  }

  public void clearTitleProperty() {
    titleLabel.setText(null);
    timeComplexityLabel.setText(null);
    spaceComplexityLabel.setText(null);
  }

}
