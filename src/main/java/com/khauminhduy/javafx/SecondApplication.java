package com.khauminhduy.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SecondApplication extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Label label1 = new Label("Khau Minh Duy");
		label1.setFont(new Font(100));
		
		Label label2 = new Label("Nguyen Van A");
		label2.setFont(new Font(100));
		
		VBox box = new VBox(label1, label2);
		
		stage.setScene(new Scene(box));
		stage.setTitle("Second App");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

}
