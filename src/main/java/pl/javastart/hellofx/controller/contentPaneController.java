package pl.javastart.hellofx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class contentPaneController {

    @FXML
    private textPaneController textPaneController;

    @FXML
    private Button clearButton;

    public void initialize() {
        var inputTextArea = textPaneController.getInputTextArea();
        var outputTextArea = textPaneController.getOutputTextArea();

        clearButton.setOnAction(event -> {
            inputTextArea.clear();
            outputTextArea.clear();
        });
    }
}