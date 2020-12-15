module javafx {
    requires javafx.graphics;
    exports pl.javastart.hellofx to javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    exports pl.javastart.mp3player.main to javafx.graphics;
}