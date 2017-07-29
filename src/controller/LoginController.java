package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import database.DbConnect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
	
	public static Integer questionNumber = 0;
	DbConnect db = new DbConnect();
	String logowanie = "";

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
    	Statement stat = conn.createStatement();
    	System.out.println("klik3");
        ResultSet rs = stat.executeQuery("select * from user where name = '"+nameField.getText()+"' and surname = '"+lastField.getText()+"';");
        System.out.println("klik4");
        while (rs.next()) {
        	  logowanie = rs.getString("userName");
        	  System.out.println(logowanie);
        }
    	
    	
    	if (!logowanie.isEmpty()) {
    		Stage stageTab = new Stage();
    		Parent root = (Parent) FXMLLoader.load(getClass().getResource("/fxDB/view/TableView.fxml"));
    		Scene sceneTable = new Scene (root);
    		stageTab.setScene(sceneTable);
    		stageTab.show();

    		
    		//grid.setVisible(false);
    		
    		
    		
    	} else {
    		logInfo.setText("B£ÊDNY LOGIN LUB HAS£O");
    		pass.setText(null);
    		altPass.setText(null);
    		JOptionPane.showMessageDialog(null, "Z³e dane logowania");
    	}
    	
    	
    }

}

