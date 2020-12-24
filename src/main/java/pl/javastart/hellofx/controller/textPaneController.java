package pl.javastart.hellofx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class textPaneController {

    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextArea outputTextArea;

    public TextArea getInputTextArea() {
        return inputTextArea;
    }

    public TextArea getOutputTextArea() {
        return outputTextArea;
    }

    public void initialize() {
        inputTextArea.addEventFilter(KeyEvent.KEY_RELEASED,
                x -> reverseTextHandler(inputTextArea, outputTextArea)
        );
        outputTextArea.addEventFilter(KeyEvent.KEY_RELEASED,
                x -> reverseTextHandler(outputTextArea, inputTextArea)
        );
    }

    private void reverseTextHandler(TextArea source, TextArea target) {
        target.setText(new StringBuilder(source.getText()).reverse().toString());
    }

}