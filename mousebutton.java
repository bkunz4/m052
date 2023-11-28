import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class mousebutton extends Application {
	@Override // Overrides the start method in the Application class
	public void start(Stage primaryStage) {
		// Creates a Stack pane
		StackPane pane = new StackPane();

		// Creates a circle and its properties
		Circle circle = new Circle(50);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		pane.getChildren().add(circle);

		// Creates and registers the handler
		pane.setOnMousePressed(e -> {
			circle.setFill(Color.BLACK);
		});

		pane.setOnMouseReleased(e -> {
			circle.setFill(Color.WHITE);
			circle.setStroke(Color.BLACK);
		});

		Scene scene = new Scene(pane, 120, 120);
		primaryStage.setTitle("mousebutton"); // Sets the stage title
		primaryStage.setScene(scene); // Puts the scene in the stage
		primaryStage.show(); // Displays the stage

	}
}