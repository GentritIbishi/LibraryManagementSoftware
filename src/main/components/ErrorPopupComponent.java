package main.components;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class ErrorPopupComponent {
	public static void show(Exception e) {
		String message = e.getMessage();
		if (message == null || message.length() == 0)
			message = e.toString();
		show(message);
	}

	public static void show(String message) {
		show(message, "Error");
	}

	public static void show(String message, String title) {
	    Alert alert = new Alert(AlertType.ERROR);
	    alert.setTitle(title);
	    alert.setHeaderText(title);

	    Label label = new Label(message);
	    label.setWrapText(true);
	    label.setMaxWidth(400);
	    StackPane pane = new StackPane(label);
	    alert.getDialogPane().setContent(pane);

	    alert.showAndWait();
	  }
	}
