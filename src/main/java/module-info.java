module javafx {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;

    exports pl.javastart.mp3player.main to javafx.graphics;
    exports pl.javastart.hellofx.main to javafx.graphics;
    opens pl.javastart.hellofx.controller to javafx.fxml;
    opens pl.javastart.mp3player.controller to javafx.fxml;
}