package com.example.myfirstproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label empty;

    @FXML
    private Label emptyB;

    @FXML
    private TextField inputFrstNum;

    @FXML
    private TextField inputScndNum;

    @FXML
    private TextField resultLabel;

    @FXML
    private Label welcomeText;

    @FXML
    void degreeAction(ActionEvent event) {
        int i_1= Integer.parseInt (inputFrstNum.getText());
        int i_2 = Integer.parseInt (inputScndNum.getText());
        int result = (int) (Math.pow(i_1,i_2));
        System.out.println(result);
    }

    @FXML
    void divisionAction(ActionEvent event) {
        String input1 = inputFrstNum.getText();
        String input2 = inputScndNum.getText();
        int i1 = Integer.parseInt(input1);
        int i2 = Integer.parseInt(input2);
        int query = i1/i2;
        System.out.println(query);
    }

    @FXML
    void minusAction(ActionEvent event) {
        String input1 = inputFrstNum.getText();
        String input2 = inputScndNum.getText();
        int i1 = Integer.parseInt(input1);
        int i2 = Integer.parseInt(input2);
        int query = i1-i2;
        System.out.println(query);
    }

    @FXML
    void multipAction(ActionEvent event) {
        String input1 = inputFrstNum.getText();
        String input2 = inputScndNum.getText();
        int i1 = Integer.parseInt(input1);
        int i2 = Integer.parseInt(input2);
        int query = i1*i2;
        System.out.println(query);
    }

    @FXML
    void pDivivsionAction(ActionEvent event) {
        String input1 = inputFrstNum.getText();
        String input2 = inputScndNum.getText();
        int i1 = Integer.parseInt(input1);
        int i2 = Integer.parseInt(input2);
        int query = i1%i2;
        System.out.println(query);
    }

    @FXML
    void plusAction(ActionEvent event) {
        String input1 = inputFrstNum.getText();
        String input2 = inputScndNum.getText();
        int i1 = Integer.parseInt(input1);
        int i2 = Integer.parseInt(input2);
        int query = i1+i2;
        System.out.println(query);
    }

    @FXML
    void initialize() {
        empty.setVisible(false);
        emptyB.setVisible(false);
    }

}