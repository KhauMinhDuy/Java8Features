package com.khauminhduy.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class FIrstApplication extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Label message = new Label("Hello World");
		message.setFont(new Font(100));
		
		stage.setScene(new Scene(message));
		stage.setTitle("Hello");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

}
