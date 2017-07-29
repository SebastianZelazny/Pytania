package controller;

import java.io.IOException;
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
	public static Boolean categoryJava = false;
	public static Boolean categoryDb = false;
	public static Boolean categoryPython = false;
	public static Boolean categoryFE = false;
	public static Boolean categorySpring = false;
	Boolean categoryControl = categoryJava & categoryDb & categoryPython & categoryFE & categorySpring;
	
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
    void loginToDb(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {

    	Connection conn = db.Connection();
    	Statement stat = conn.createStatement();
    	System.out.println("klik3");
        ResultSet rs = stat.executeQuery("select * from user where name = '"+nameField.getText()+"' and surname = '"+lastField.getText()+"';");
        System.out.println("klik4");
        while (rs.next()) {
        	  logowanie = rs.getString("name");
        	  System.out.println(logowanie);
        }
    	
    	
    	if (!logowanie.isEmpty()) {
    		/*Stage stageTab = new Stage();
    		Parent root = (Parent) FXMLLoader.load(getClass().getResource("/view/.fxml"));
    		Scene sceneTable = new Scene (root);
    		stageTab.setScene(sceneTable);
    		stageTab.show();	*/	
    		
    		questionNumber = Integer.valueOf(questNum.getText());
    		while (true) {
				if ((questionNumber > 0 & questionNumber < 99)) {
					
					System.out.println(questionNumber);
					if (cat1Box.isSelected()) {
						categoryDb = true;
					}
					if (cat2Box.isSelected()) {
						categoryPython = true;
					}
					if (cat3Box.isSelected()) {
						categoryFE = true;
					}
					if (cat4Box.isSelected()) {
						categoryJava = true;
					}
					if (cat5Box.isSelected()) {
						categorySpring = true;
					}
					break;
				} else {
					JOptionPane.showMessageDialog(null, "Niew³aœciwa liczba pytañ");
					break;
				} 
			}
    		
    		if (categoryControl.booleanValue()) {
    			
    		}
			
    		
    		
    	} else {
    		nameField.setText(null);
    		lastField.setText(null);
    		JOptionPane.showMessageDialog(null, "Z³e dane logowania");
    	}
    	
    	
    }

}

