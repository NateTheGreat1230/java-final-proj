package com.example.javafinalproj;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class startController extends Pane {
    private final Stage startstage;

    @FXML
    private Button startbtn;
    public startController() {

        startstage = new Stage();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("start.fxml"));

            // Set this class as the controller
            loader.setController(this);

            // Load the scene
            startstage.setScene(new Scene(loader.load()));

            // Setup the window/stage
            startstage.setTitle("Passing Controllers Example - Layout1");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void showStage() {
        startstage.showAndWait();
    }

    public void startclick(){
        System.out.println("TESTING!!!");
    }
    /*public Controls() throws IOException {
        setControls();

    }
    protected void setControls(){
        Button single = new Button("Single Player");
        Button multi = new Button("Multi Player");
        getChildren().addAll(single,multi);
    }*/
}
