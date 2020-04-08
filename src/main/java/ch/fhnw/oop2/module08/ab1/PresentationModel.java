package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

	final StringProperty titleProperty;
	final StringProperty buttonProperty;

	public PresentationModel() {
		titleProperty = new SimpleStringProperty("JavaFX Application");
		buttonProperty = new SimpleStringProperty("Hello World!");
	}

	public StringProperty getTitleProperty() {
		return titleProperty;
	}

	public String getTitle() {
		return titleProperty.get();
	}

	public void setTitle(String title) {
		this.titleProperty.set(title);
	}

	public StringProperty getButtonTitleProperty() {
		return buttonProperty;
	}

	public String getButtonTitle() {
		return buttonProperty.get();
	}

	public void setButtonTitle(String title) {
		this.buttonProperty.set(title);
	}

}
