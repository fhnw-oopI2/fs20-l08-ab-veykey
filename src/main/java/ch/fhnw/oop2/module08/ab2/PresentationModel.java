package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PresentationModel {

	private StringProperty titleProperty;
	private StringProperty buttonProperty;

	private enum State {
		ON, OFF;
	}

	public PresentationModel() {
		titleProperty = new SimpleStringProperty("Toggle Application");
		buttonProperty = new SimpleStringProperty(State.OFF.toString());
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

	
	public void toggle() {
		if (this.getButtonTitle().equals(State.ON.toString())) {
			this.setButtonTitle(State.OFF.toString());
		} else {
			this.setButtonTitle(State.ON.toString());
		}
	}

}
