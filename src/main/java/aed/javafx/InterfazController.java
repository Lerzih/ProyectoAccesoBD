package aed.javafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class InterfazController implements Initializable {
	
	
	public InterfazController() throws IOException {
		// TODO Auto-generated constructor stub
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Inicio.fxml"));
		loader.setController(this);
		loader.load();
	}
	
	@FXML
    private VBox view;

    @FXML
    private Button MySQL;

    @FXML
    private Button Access;

    @FXML
    private Button SQLServer;

    @FXML
    void OnClickEvent(ActionEvent event) {

    }
    
    public VBox getView() {
		return view;
	}

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	} 

}

