package pl.javastart.mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private Button previousButton;

    @FXML
    private Button nextButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider progressSlider;

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private TableView<?> contentTable;

    private void configureSlider() {
        volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, volumeSliderEvent -> {
            System.out.println("Wciśnięto przycisk na suwaku głośności");
        });
    }

    private void configureButtons() {
        playButton.setOnAction(playButtonEvent -> {
            if (playButton.isSelected()) {
                System.out.println("Play");
            } else {
                System.out.println("Stop");
            }

        });

        previousButton.setOnAction(previousSongEvent -> {
            System.out.println("Previous song");
        });

        nextButton.setOnAction(nextSongEvent -> {
            System.out.println("Next song");
        });
    }

    public void initialize() {
        System.out.println("MainController initialized");
        configureButtons();
        configureSlider();
        }

    }

