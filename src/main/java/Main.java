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
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the titleBar.fxml file
        FXMLLoader titleBarLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/titleBar.fxml"));
        BorderPane titleBar = titleBarLoader.load();

        // Load the main.fxml file
        FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("/main/resources/fxml/main.fxml"));
        AnchorPane mainContent = mainLoader.load();

        // Set the main content to the bottom anchor pane of the titleBar
        titleBar.setBottom(mainContent);

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
        primaryStage.setTitle("JavaFX Application");
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

