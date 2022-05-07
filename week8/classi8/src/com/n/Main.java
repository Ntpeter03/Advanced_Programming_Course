package com.n;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.SQLException;


//database : classi      table: users       columns :   user_name    password     name      email
    //you should import mysql j8 connector library to run
    public class Main extends Application {
        protected static Stage window;

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage stage) throws SQLException {
            //we call our Main stage window.
            window = stage;
            window.setTitle("classi8");
            window.setResizable(false);
            showSignUp();

            window.show();
        }
    public static void showSignUp() throws SQLException {
            SignUpView view = new SignUpView();
            window.setScene(new Scene(view.getRoot(),600,600));
    }
    public static void showSignIn() {
        SignInView view = new SignInView();
        window.setScene(new Scene(view.getRoot(),600,600));
    }

    }

