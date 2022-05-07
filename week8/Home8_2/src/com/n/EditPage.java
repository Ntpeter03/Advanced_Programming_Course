package com.n;

import com.n.model.Entity;
import com.n.model.Service;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class EditPage {
    public Group group = new Group();

    public AnchorPane aPane = new AnchorPane();

    public TextField nameField = new TextField();
    public TextField userNameField = new TextField();
    public TextField passwordField = new TextField();
    public TextField emailField = new TextField();

    public Label firstNameLabel = new Label();
    public Label passwordLabel = new Label();
    public Label emailLabel = new Label();
    public Label userNameLabel = new Label();

    public Button editButton = new Button();


    public Group getRoot(String username) {

        nameField.setLayoutX(140);
        nameField.setLayoutY(100);
        nameField.setPrefHeight(25);
        nameField.setPrefWidth(400);
        nameField.setPromptText("First Name");

        userNameField.setLayoutX(140);
        userNameField.setLayoutY(175);
        userNameField.setPrefHeight(25);
        userNameField.setPrefWidth(400);
        userNameField.setPromptText("User Name");
        userNameField.setText(username);
        userNameField.setDisable(true);

        passwordField.setLayoutX(140);
        passwordField.setLayoutY(250);
        passwordField.setPrefHeight(25);
        passwordField.setPrefWidth(400);
        passwordField.setPromptText("Password");

        emailField.setLayoutX(140);
        emailField.setLayoutY(325);
        emailField.setPrefHeight(25);
        emailField.setPrefWidth(400);
        emailField.setPromptText("Email");

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






        editButton.setLayoutX(100);
        editButton.setLayoutY(500);
        editButton.setText("Add");
        editButton.setOnAction(e -> this.addButtonAction());


        group.getChildren().add(aPane);
        group.getChildren().add(nameField);
        group.getChildren().add(userNameField);
        group.getChildren().add(passwordField);
        group.getChildren().add(emailField);
        group.getChildren().add(editButton);
        group.getChildren().add(firstNameLabel);
        group.getChildren().add(passwordLabel);
        group.getChildren().add(emailLabel);
        group.getChildren().add(userNameLabel);

        return group;
    }

    public void addButtonAction(){
        Entity entity = new Entity();
        if((!nameField.getText().equals(""))&&(!userNameField.getText().equals(""))&&(!passwordField.getText().equals("")&&
                (!emailField.getText().equals("")))){
            try {
                entity.setName(nameField.getText());
                entity.setUserName(userNameField.getText());
                entity.setPassword(passwordField.getText());
                entity.setEmail(emailField.getText());
                try{
                    Service.getInstance().edit(entity);}
                catch (Exception e){
                    System.out.println("Error signing up");
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
