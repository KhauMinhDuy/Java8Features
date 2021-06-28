package com.khauminhduy.javafx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

	@FXML
	private TextField username;

	@FXML
	private PasswordField password;

	@FXML
	private Button okButton;

	@FXML
	private Button cancelButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	public void okAction(ActionEvent event) {
		if(!username.getText().equals("") && !password.getText().equals("")) {
			System.out.println(username.getText() + " | " + password.getText());
		}
	}

	@FXML
	public void cancelAction( ) {
		System.exit(0);
	}

}
