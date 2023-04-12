package main.java.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class mainController {

    @FXML
    private Button homeButton;

    @FXML
    private AnchorPane innerAnchorPane;

    @FXML
    private Button profileButton;

    @FXML
    private TextField searchBar;

    @FXML
    private Button searchButton;

    @FXML
    private Button soundButton;

    @FXML
    private Button uploadButton;

    @FXML
    void homeButtonClicked(ActionEvent event) {

    }

    @FXML
    void profileButtonClicked(ActionEvent event) {

    }

    @FXML
    void searchButtonClicked(ActionEvent event) {

    }

    @FXML
    void soundButtonClicked(ActionEvent event) {

    }

    @FXML
    void uploadButtonClicked(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/main/resources/fxml/file_upload.fxml"));
            innerAnchorPane.getChildren().setAll(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
