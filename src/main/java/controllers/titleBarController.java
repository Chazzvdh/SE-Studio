package main.java.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class titleBarController {

    @FXML
    private Button closeButton;

    @FXML
    private Button maximizeButton;

    @FXML
    private Button minimizeButton;

    @FXML
    private AnchorPane topAnchorPane;

    @FXML
    private AnchorPane bottomAnchorPane;

    @FXML
    void closeButtonClicked(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void maximizeButtonClicked(ActionEvent event) {
        Stage stage = (Stage) maximizeButton.getScene().getWindow();
        if (stage.isMaximized()) {
            stage.setMaximized(false);
        } else {
            stage.setMaximized(true);
        }
    }

    @FXML
    void minimizeButtonClicked(ActionEvent event) {
        Stage stage = (Stage) minimizeButton.getScene().getWindow();
        stage.setIconified(true);
    }

}
