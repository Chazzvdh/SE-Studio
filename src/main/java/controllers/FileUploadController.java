package main.java.controllers;// FileUploadController.java

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.FileChooser;

import java.io.File;

public class FileUploadController {
    @FXML
    private TableView<File> fileTableView;

    @FXML
    private Label selectedFileLabel;

    private ObservableList<File> fileData;

    private FileChooser fileChooser;

    public void initialize() {
        fileData = FXCollections.observableArrayList();
        fileTableView.setItems(fileData);

        fileChooser = new FileChooser();
        fileChooser.setTitle("Choose a file");

        TableColumn<File, String> fileNameColumn = new TableColumn<>("File Name");
        fileNameColumn.setPrefWidth(200);
        fileNameColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getName()));

        TableColumn<File, String> filePathColumn = new TableColumn<>("File Path");
        filePathColumn.setPrefWidth(200);
        filePathColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getAbsolutePath()));

        fileTableView.getColumns().addAll(fileNameColumn, filePathColumn);
    }

    @FXML
    private void handleAddFileAction(ActionEvent event) {
        File selectedFile = fileChooser.showOpenDialog(selectedFileLabel.getScene().getWindow());
        if (selectedFile != null) {
            System.out.println(String.format("Trying to add the file: %s", selectedFile));
            fileData.add(selectedFile);
            selectedFileLabel.setText("No file selected");
        }
    }

}
