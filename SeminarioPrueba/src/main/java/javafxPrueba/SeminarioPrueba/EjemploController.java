package javafxPrueba.SeminarioPrueba;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EjemploController {

	@FXML
	TextField textfielduser;

	@FXML
	TextField textfieldpassword;

	@FXML
	Button btn;

	@FXML
	String param;

	@FXML
	public void signUp() throws IOException {
		System.out.println(textfielduser.getText());
		System.out.println(textfieldpassword.getText());
		
		FXMLLoader fxmlLoader = App.setRoot("primary");
		
		PrimaryController primaryController = fxmlLoader.getController();
		primaryController.param = textfielduser.getText();
	}
}
