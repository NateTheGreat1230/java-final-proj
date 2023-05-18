package com.example.javafinalproj;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("start.fxml"));
        // Create a scene and place it in the stage
        Scene scene = new Scene(loader.load(),1000,1000);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());
        primaryStage.setTitle("Tic Tac Toe"); // Set the stage title
        //this.stage.setScene(scene);
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
    @FXML
    public void startclick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("game.fxml"));
        // Create a scene and place it in the stage
        Scene scene = new Scene(loader.load(),1000,1000);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());
        Stage stage = new Stage();
        stage.setTitle("Game");
        stage.setScene(scene); // Place the scene in the stage
        stage.show(); // Display the stage
    }
}