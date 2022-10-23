package javafxPrueba.SeminarioPrueba;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class SecondaryController {

	@FXML
	public String param;
    @FXML
    private void switchToPrimary() throws IOException {
    	FXMLLoader fxmlLoader = App.setRoot("ejemplo");
		PrimaryController primaryController = fxmlLoader.getController();
    }
}