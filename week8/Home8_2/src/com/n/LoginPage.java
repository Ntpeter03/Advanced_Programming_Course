package com.n;


import com.n.model.Entity;
import com.n.model.Service;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.sql.SQLException;

public class LoginPage {
    public Group group = new Group();

    public AnchorPane aPane = new AnchorPane();

    public TextField customerUserNameField = new TextField();
    public TextField customerPasswordField = new TextField();


    public Label passwordLabel = new Label();
    public Label userNameLabel = new Label();

    public Button logInButton = new Button();


    public Group getRoot() {


        customerUserNameField.setLayoutX(140);
        customerUserNameField.setLayoutY(100);
        customerUserNameField.setPrefHeight(25);
        customerUserNameField.setPrefWidth(400);
        customerUserNameField.setPromptText("User Name");

        customerPasswordField.setLayoutX(140);
        customerPasswordField.setLayoutY(175);
        customerPasswordField.setPrefHeight(25);
        customerPasswordField.setPrefWidth(400);
        customerPasswordField.setPromptText("Password");


        userNameLabel.setLayoutX(50);
        userNameLabel.setLayoutY(100);
        userNameLabel.setText("User Name :");
        userNameLabel.setStyle("-fx-font-size: 15px ;" +
                "-fx-font-weight : bold ;");
        userNameLabel.setTextFill(Color.BLACK);


        passwordLabel.setLayoutX(50);
        passwordLabel.setLayoutY(175);
        passwordLabel.setText("Password :");
        passwordLabel.setStyle("-fx-font-size: 15px ;" +
                "-fx-font-weight : bold ;");
        passwordLabel.setTextFill(Color.BLACK);






        logInButton.setLayoutX(100);
        logInButton.setLayoutY(500);
        logInButton.setText("SignIn");
        logInButton.setOnAction(e -> {
            try {
                this.logInButtonAction();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });


        group.getChildren().add(aPane);
        group.getChildren().add(customerUserNameField);
        group.getChildren().add(customerPasswordField);
        group.getChildren().add(logInButton);
        group.getChildren().add(passwordLabel);
        group.getChildren().add(userNameLabel);
        return group;
    }

    public void logInButtonAction() throws SQLException {
        Entity loginEntity = new Entity();
        String userName = customerUserNameField.getText();
        String password = customerPasswordField.getText();
        loginEntity.setUserName(userName);
        loginEntity.setPassword(password);
        if (!userName.equals("")) {
            if (Service.getInstance().userNameExistence(loginEntity)) {
                if (!password.equals("")) {
                    if (Service.getInstance().password(loginEntity)) {
                        System.out.println("ok");
                        Main.showEditPage(userName);
                    }
                    else {System.out.println("Wrong Password");}
                } else {System.out.println("Please Provide a Password");}
            } else {System.out.println("Wrong userID");}
        } else {System.out.println("Please Provide a userID");}
    }
}
