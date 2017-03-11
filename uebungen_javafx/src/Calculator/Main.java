package Calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//anstelle einer pane wird hier die pane vom scenebuilder direkt importiert
			Parent root = FXMLLoader.load(getClass().getResource("/Calculator/View.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/Calculator/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
	

}

	/**ergänzungen layout
	 * bei der HBox: 
	 * -alignement = center, buttons 4x kopieren und einfügen -> ergibt die 1. reihe beim calc
	 * -spacing HBox = 10 -> zwischen den buttons (oder den elementen) hat es autom. einen abstand
	 * buttons layout:
	 * -alle markieren
	 * -properties: schriftgrösse auf 18
	 * -->buttons ein wenig zu gross, width auf 50
	 * 
	 */

