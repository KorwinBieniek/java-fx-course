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

        clearButton.setOnAction(event -> {
            inputTextArea.clear();
        });
    }
}