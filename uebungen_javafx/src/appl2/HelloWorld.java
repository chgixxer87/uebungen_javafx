package appl2;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//immer in main
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn1 = new Button("click");
		Button btn2 = new Button ("exit");
		
		//lambda expression; exits the whole program
		//more than 1 expression with {}
		btn2.setOnAction(e -> {
			System.out.println("i will exit now");
			System.exit(0);
		});
		
		//variante3
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("helloWorld");
				
			}
		});;
		
		//create layout
		
		VBox root = new VBox();
		//es können auch mehrere buttons hier mitgegeben werden (mit addAll). adds immer mit getChildren
		//nur 1 button? -->mit getChildren().add(btn);
		root.getChildren().addAll(btn1, btn2);
		
		//scene hier immer noch leer. scene erstellen (=inhalt, hier die buttons)
		//(grösse der scene definieren!
		Scene scene1 = new Scene (root,500,300);
		
		primaryStage.setTitle("hallo");
		primaryStage.setScene(scene1);
		
		//am anfang noch leere stage
		primaryStage.show();
		
		
	}

}
