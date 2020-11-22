package aed.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Interfaz extends Application {
	
	private InterfazController controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new InterfazController();	

		Scene scene = new Scene(controller.getView());
	
		primaryStage.setTitle("Acceso a datos");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
}
