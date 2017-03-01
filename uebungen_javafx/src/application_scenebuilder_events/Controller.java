package application_scenebuilder_events;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

//controller in den scenebuilder ziehen: linke hälfte auf controller reiter, controller class unten den entsprechenden controller
//wählen
public class Controller {
	int count =0;
	
	//anstatt auf der konsole sollen die werte direkt auf der scene ausgegeben werden in einem label
	//dazu muss mit @FXML der controller verlinkt werden mit dem scenebuilder, damit das message-label im scenebuilder ausgewählt
	//werden kann
	
	@FXML
	Label message;//das message-label kann nun im scenebuilder unter code und Identify ausgewählt werden. das label wurde
	//bereits in der pane positioniert, nun kann man das label in der methode unten verwenden
	
	@FXML
	Label message2;//für jedes label einzel IMMER @FXML
	
	//immer wenn ein button geklickt wird, wird diese methode ausgeführt. daher übergabeparameter an die methode = ein actionevent
	//die methode kann auch in den scenebuilder automatisch geholt werden, da im gleichen package (auf rechter hälfte letzter reiter: code, dann
	//bei On Action die methode auswählen)
	public void generateRandom(ActionEvent e){
		count++;
		Random rand = new Random ();
		
		int value = rand.nextInt(50)+1;
		
		message.setText(Integer.toString(value));
		message2.setText("der button wurde"+count+" mal gedrückt");
		
		
		
		//System.out.println(Integer.toString(value));
		
		
		
	}

}
