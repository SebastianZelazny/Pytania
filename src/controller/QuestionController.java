package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DbConnect;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class QuestionController {
	private int licznik;
	
	public int getLicznik() {
		return licznik;
	}

	public void setLicznik(int licznik) {
		this.licznik = licznik;
	}
	DbConnect dbcon;
	
	private String trueask;
	private int number_true;
	private int number_false;
	
    @FXML
    private Label LblTitle;

    @FXML
    private Label LblLicznik;

    @FXML
    private Label LblQuestion;

    @FXML
    private Button BtnNext;
    @FXML
    private ToggleGroup TGQuestion;
    @FXML
    private RadioButton RBQuest2;

    @FXML
    private RadioButton RBQuest3;

    @FXML
    private RadioButton RBQuest1;

    @FXML
    private RadioButton RBQuest4;
    @FXML
    private Button BtnScoo;

    @FXML
    private Label LblError;

    public void initialize()
    {
    	dbcon = new DbConnect();
    }

	@FXML
    void NextQuestion(MouseEvent event) {
    	//PreparedStatement preparedStmt = null;
    	Connection con;
    	ResultSet rs;
		try {
			String GetQuest = "Select * from questions where ";
			con = dbcon.Connection();
			rs = con.createStatement().executeQuery(GetQuest);
			while(rs.next())
			{
				LblQuestion.setText(rs.getString(2));
				RBQuest1.setText(rs.getString(3));
				RBQuest2.setText(rs.getString(4));
				RBQuest3.setText(rs.getString(5));
				RBQuest4.setText(rs.getString(6));
				trueask = rs.getString(7);
				
				System.out.println(TGQuestion.getSelectedToggle());
				
			}
			setLicznik(getLicznik()+1);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    }

    @FXML
    void Scoore(MouseEvent event) {

    }

}
