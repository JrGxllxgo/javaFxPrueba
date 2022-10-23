package javafxPrueba.SeminarioPrueba;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

	private static Scene scene;

	private static Stage stage;

	@Override
	public void start(Stage stage) throws IOException {
		this.stage = stage;
		scene = new Scene(loadFXML("ejemplo").load());
		stage.setScene(scene);
		stage.show();
	}

	static FXMLLoader setRoot(String fxml) throws IOException {
		FXMLLoader fxmlLoader = loadFXML(fxml);
		stage.hide();
		scene.setRoot(fxmlLoader.load());
		stage.show();
		return fxmlLoader;
	}

	private static FXMLLoader loadFXML(String fxml) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
		return fxmlLoader;
	}

	public static void main(String[] args) {
		launch();
	}

}