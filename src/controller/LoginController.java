package controller;

import java.sql.Connection;
import java.sql.SQLException;

import database.DbConnect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class LoginController {
	
	public static Integer questionNumber = 0;
	DbConnect db = new DbConnect();

    @FXML
    private TextField nameField;

    @FXML
    private TextField lastField;

    @FXML
    private TextField questNum;

    @FXML
    private Button loginBtn;

    @FXML
    private Button newUserBtn;

    @FXML
    private CheckBox cat1Box;

    @FXML
    private CheckBox cat2Box;

    @FXML
    private CheckBox cat3Box;

    @FXML
    private CheckBox cat4Box;

    @FXML
    private CheckBox cat5Box;

    @FXML
    void cat1Select(ActionEvent event) {

    }

    @FXML
    void cat2Select(ActionEvent event) {

    }

    @FXML
    void cat3Select(ActionEvent event) {

    }

    @FXML
    void cat4Select(ActionEvent event) {

    }

    @FXML
    void cat5Select(ActionEvent event) {

    }

    @FXML
    void createUser(ActionEvent event) {

    }

    @FXML
    void loginToDb(ActionEvent event) throws ClassNotFoundException, SQLException {

    	Connection conn = db.Connection();
    	
    	
    }

}

