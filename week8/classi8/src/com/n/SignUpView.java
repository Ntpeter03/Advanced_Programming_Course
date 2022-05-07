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

public class SignUpView {
    public Group group = new Group();

    public AnchorPane aPane = new AnchorPane();

    public TextField customerNameField = new TextField();
    public TextField customerUserNameField = new TextField();
    public TextField customerPasswordField = new TextField();
    public TextField customerEmailField = new TextField();

    public Label firstNameLabel = new Label();
    public Label passwordLabel = new Label();
    public Label emailLabel = new Label();
    public Label userNameLabel = new Label();

    public Button signInButton = new Button();
    public Button addButton = new Button();


    public Group getRoot() {

        customerNameField.setLayoutX(140);
        customerNameField.setLayoutY(100);
        customerNameField.setPrefHeight(25);
        customerNameField.setPrefWidth(400);
        customerNameField.setPromptText("First Name");

        customerUserNameField.setLayoutX(140);
        customerUserNameField.setLayoutY(175);
        customerUserNameField.setPrefHeight(25);
        customerUserNameField.setPrefWidth(400);
        customerUserNameField.setPromptText("User Name");

        customerPasswordField.setLayoutX(140);
        customerPasswordField.setLayoutY(250);
        customerPasswordField.setPrefHeight(25);
        customerPasswordField.setPrefWidth(400);
        customerPasswordField.setPromptText("Password");

        customerEmailField.setLayoutX(140);
        customerEmailField.setLayoutY(325);
        customerEmailField.setPrefHeight(25);
        customerEmailField.setPrefWidth(400);
        customerEmailField.setPromptText("Email");

        //setting labels


        firstNameLabel.setLayoutX(50);
        firstNameLabel.setLayoutY(100);
        firstNameLabel.setText("Name :");
        firstNameLabel.setStyle("-fx-font-size: 15px ;" +
                "-fx-font-weight : bold ;");
        firstNameLabel.setTextFill(Color.BLACK);

        userNameLabel.setLayoutX(50);
        userNameLabel.setLayoutY(175);
        userNameLabel.setText("User Name :");
        userNameLabel.setStyle("-fx-font-size: 15px ;" +
                "-fx-font-weight : bold ;");
        userNameLabel.setTextFill(Color.BLACK);


        passwordLabel.setLayoutX(50);
        passwordLabel.setLayoutY(250);
        passwordLabel.setText("Password :");
        passwordLabel.setStyle("-fx-font-size: 15px ;" +
                "-fx-font-weight : bold ;");
        passwordLabel.setTextFill(Color.BLACK);


        emailLabel.setLayoutX(50);
        emailLabel.setLayoutY(325);
        emailLabel.setText("Email :");
        emailLabel.setStyle("-fx-font-size: 15px ;" +
                "-fx-font-weight : bold ;");
        emailLabel.setTextFill(Color.BLACK);




        signInButton.setLayoutX(200);
        signInButton.setLayoutY(500);
        signInButton.setText("SignIn");
        signInButton.setOnAction(e -> Main.showSignIn());

        addButton.setLayoutX(100);
        addButton.setLayoutY(500);
        addButton.setText("Add");
        addButton.setOnAction(e -> this.addButtonAction());


        group.getChildren().add(aPane);
        group.getChildren().add(customerNameField);
        group.getChildren().add(customerUserNameField);
        group.getChildren().add(customerPasswordField);
        group.getChildren().add(customerEmailField);
        group.getChildren().add(signInButton);
        group.getChildren().add(addButton);
        group.getChildren().add(firstNameLabel);
        group.getChildren().add(passwordLabel);
        group.getChildren().add(emailLabel);
        group.getChildren().add(userNameLabel);

        return group;
    }

    public void addButtonAction(){
        Entity entity = new Entity();
        if((!customerNameField.getText().equals(""))&&(!customerUserNameField.getText().equals(""))&&(!customerPasswordField.getText().equals("")&&
                (!customerEmailField.getText().equals("")))){
            try {
                entity.setName(customerNameField.getText());
                entity.setUserName(customerUserNameField.getText());
                entity.setPassword(customerPasswordField.getText());
                entity.setEmail(customerEmailField.getText());
                try{
                    Service.getInstance().signIn(entity);}
                catch (Exception e){
                    System.out.println("Error signing up");
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
