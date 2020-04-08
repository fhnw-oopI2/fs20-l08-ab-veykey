package ch.fhnw.oop2.module08.ab2;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ApplicationUI extends StackPane {

	private Button button;
	private PresentationModel pm;

	public ApplicationUI(PresentationModel pm) {
		initializeControls();
		layoutControls();

	}

	private void initializeControls() {
		this.button = new Button();
		this.pm = new PresentationModel();
		button.setOnAction(event -> pm.toggle());
		button.textProperty().bindBidirectional(pm.getButtonTitleProperty());

	}

	private void layoutControls() {
		setAlignment(Pos.CENTER);
		getChildren().add(button);

	}

}
