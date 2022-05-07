package com.n;

import com.n.model.Entity;
import com.n.model.Service;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField fName;
    public TextField faName;
    public TextField nCode;
    public TextField lName;
    public TextField sName;
    public ChoiceBox<String> mChoiceBox;
    public TextField fieldOfStudy;
    public TextField university;
    public TextField address;
    public Button button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sName.setDisable(true);
        sName.setText("");
        mChoiceBox.getItems().add("Married");
        mChoiceBox.getItems().add("Single");

        mChoiceBox.setOnAction(e -> {
           String s =  mChoiceBox.getValue();
           if (s.equals("Married")){
               sName.setDisable(false);
           }
            if (s.equals("Single")){
                sName.setDisable(true);
                sName.setText("");
            }
        });





    }
    public void buttonAction() {
        Entity e = new Entity();
        e.setFirstname(fName.getText());
        e.setLastname(lName.getText());
        e.setFatherName(faName.getText());
        e.setCode(nCode.getText());
        e.setMartial(mChoiceBox.getValue());
        e.setSpouse(sName.getText());
        e.setFieldOfStudy(fieldOfStudy.getText());
        e.setUniversity(university.getText());
        e.setAddress(address.getText());

        try {
            Service.getInstance().add(e);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
