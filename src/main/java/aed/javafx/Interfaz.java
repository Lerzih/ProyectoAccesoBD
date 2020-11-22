package aed.javafx;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Interfaz extends Application {
	
	private InterfazController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new InterfazController();	

		Scene scene = new Scene(controller.getView(), 480, 300);
	
		primaryStage.setTitle("Acceso a datos");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
