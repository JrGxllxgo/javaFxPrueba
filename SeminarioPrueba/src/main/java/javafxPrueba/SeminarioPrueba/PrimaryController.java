package javafxPrueba.SeminarioPrueba;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {
	@FXML 
	public String param;
    @FXML
    private void switchToSecondary() throws IOException {
    	System.out.println(param);
		System.out.println(param);
    	FXMLLoader fxmlLoader = App.setRoot("ejemplo");
		EjemploController ejemploController = fxmlLoader.getController();
		ejemploController.param = param;
    }
}
