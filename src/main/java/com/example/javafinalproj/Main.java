package com.example.javafinalproj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        //startController controls = new startController();
        //controls.showStage();

        Object start = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("start.fxml")));

        // Create a scene and place it in the stage
        Scene scene = new Scene((Parent) start,1000,1000);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());
        primaryStage.setTitle("Tic Tac Toe"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }
}