package pl.javastart.hellofx.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainHelloFx extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        VBox mainPane = FXMLLoader.load(getClass().getResource("/fxml/hellofx_fxml/contentPane.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.setTitle("Inicjalizator");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}