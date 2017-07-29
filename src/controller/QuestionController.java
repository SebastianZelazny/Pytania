package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
    	
    }

	@FXML
    void NextQuestion(MouseEvent event) {
    	PreparedStatement preparedStmt = null;
    	Connection con;
    	
    	
    }

    @FXML
    void Scoore(MouseEvent event) {

    }

}
