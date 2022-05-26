package com.dam.soundadventurefx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ScoreController {
    @FXML
    private Label scoreText;

    @FXML
    protected void onScoreButtonClick() {
        scoreText.setText("Fulano tiene X puntos!");
    }
}