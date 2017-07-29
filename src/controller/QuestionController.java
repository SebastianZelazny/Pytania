package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DbConnect;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    @FXML
    private Label LblTitle;

    @FXML
    private Label LblLicznik;

    @FXML
    private Label LblQuestion;

    @FXML
    private Button BtnNext;

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
