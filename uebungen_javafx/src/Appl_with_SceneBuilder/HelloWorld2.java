package Appl_with_SceneBuilder;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//immer in main
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//parent von root definieren: hier eine ressource aus dem SceneBuilder, die Main fxml file
		//import fxml class
		Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
		
		Scene scene1 = new Scene (root);
		
		primaryStage.setTitle("hallo");
		primaryStage.setScene(scene1);
		
		//am anfang noch leere stage
		primaryStage.show();
		
		
	}

}