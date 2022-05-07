package com.n;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class Main extends Application {
    protected static Stage window;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        //we call our Main stage window.
        window = stage;
        window.setTitle("Home8_2");
        window.setResizable(false);

        showLoginPage();

        window.show();
    }


    public static void showLoginPage() {
        LoginPage page = new LoginPage();
        window.setScene(new Scene(page.getRoot(),600,600));
    }
    public static void showEditPage(String username) {
        EditPage page = new EditPage();
        window.setScene(new Scene(page.getRoot(username),600,600));
    }

}

