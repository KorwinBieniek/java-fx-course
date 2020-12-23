package pl.javastart.hellofx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class HelloFxController {

    @FXML
    private VBox mainPaneVBox;

    @FXML
    private HBox secondPaneHBox;

    /*@FXML
    private TextArea LeftTextArea;

    @FXML
    private TextArea RightTextArea;
*/
    @FXML
    private Button clearWindowsButton;

    /*public void initialize() {
        LeftTextArea.addEventFilter(KeyEvent.KEY_RELEASED, x -> RightTextArea.setText(new StringBuilder(LeftTextArea.getText())
                .reverse().toString()));
        //RightTextArea.addEventFilter(KeyEvent.KEY_RELEASED, x -> LeftTextArea.setText(new StringBuilder(LeftTextArea.getText())
                //.reverse().toString()));

        clearWindowsButton.setOnAction(event -> {
            LeftTextArea.clear();
            RightTextArea.clear();
        });
    }*/

}


