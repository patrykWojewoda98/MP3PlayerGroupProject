package org.example.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;

public class MainPaneController {

    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button nextSongButton;

    @FXML
    private Button pauseButton;

    @FXML
    private Button playButton;

    @FXML
    private Button prevSongButton;

    @FXML
    private Button resetSongButton;

    @FXML
    private Label songLabel;

    @FXML
    private ProgressBar songProgresBar;

    @FXML
    private ComboBox<?> speedBox;

    @FXML
    private Slider volumeSlider;

    @FXML
    void changeSpeed(ActionEvent event) {

    }

    @FXML
    void pauseSong(ActionEvent event) {

    }

    @FXML
    void playNextSong(ActionEvent event) {

    }

    @FXML
    void playPrevSong(ActionEvent event) {

    }

    @FXML
    void playSong(ActionEvent event) {

    }

    @FXML
    void resetSong(ActionEvent event) {

    }

}
