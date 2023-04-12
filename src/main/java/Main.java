package main.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.java.classes.Administrator;
import main.java.classes.Customer;

public class Main extends Application {

    // Declare instance variables for storing the mouse offsets
    private double xOffset = 0;
    private double yOffset = 0;
    private boolean isMaximized = false; // Flag to check if the window is maximized

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the titleBar.fxml file
        FXMLLoader titleBarLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/titleBar.fxml"));
        BorderPane titleBar = titleBarLoader.load();

        // Load the main.fxml file
        FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/main.fxml"));
        AnchorPane mainContent = mainLoader.load();

        // Set the main content to the bottom anchor pane of the titleBar
        titleBar.setCenter(mainContent);

        // Set maximum width and height of the BorderPane
        titleBar.setMaxWidth(Double.MAX_VALUE);
        titleBar.setMaxHeight(Double.MAX_VALUE);

        // Create the scene
        Scene scene = new Scene(titleBar);

        // Set the scene on the stage
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(800);
        primaryStage.setMinHeight(300);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("SE-STUDIO");

        titleBar.setOnMousePressed(event -> {
            // Check if the mouse is clicked within the top region of the title bar
            if (event.getY() < 35 && !isMaximized) { // Change 35 to the desired height of your title bar
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        titleBar.setOnMouseDragged(event -> {
            // Check if the mouse has been pressed
            if (xOffset != 0 && yOffset != 0 && !isMaximized) {
                primaryStage.setX(event.getScreenX() - xOffset);
                primaryStage.setY(event.getScreenY() - yOffset);
            }
        });

        titleBar.setOnMouseReleased(event -> {
            // Reset the mouse offsets when the mouse is released
            xOffset = 0;
            yOffset = 0;
        });

        // Listen for changes in the window state
        primaryStage.maximizedProperty().addListener((observable, oldValue, newValue) -> {
            isMaximized = newValue; // Update the flag
        });

        primaryStage.show();
    }



    public static void main(String[] args) {
        Customer c1 = new Customer("Martijn", "martijn@ziggo.nl", "Athenestraat 14");
        Administrator a1 = new Administrator("Chazz", "chazz@ziggo.nl", "Bolivar 15");

        System.out.println(c1);
        System.out.println(a1);
        launch(args);
    }
}
