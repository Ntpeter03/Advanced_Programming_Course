package com.n;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application{
    protected static Stage window;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        window.setTitle("Home8_1");
        window.setResizable(false);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("View.fxml")));
        window.setScene(new Scene(root));

        window.show();
    }


}
