package ch.fhnw.oop2.module08.ab1;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		PresentationModel pm = new PresentationModel();
		Parent rootPanel = new ApplicationUI(pm);
		Scene scene = new Scene(rootPanel);
		
		
		primaryStage.setTitle(pm.getTitle());
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(200);
		primaryStage.show();

	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}