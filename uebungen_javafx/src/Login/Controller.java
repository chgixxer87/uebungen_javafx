package Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

	public class Controller {
	
		private int count=0;
	
		@FXML
		private Label message;
		
		@FXML
		private TextField enterUNr;
		
		@FXML
		private TextField enterPW;
		
		@FXML
		private Button exit;
		
		private String correctPW = "chgixxer87$$";
		private String UNr;
		private String enteredPW;
	
	
	public void checkPW(ActionEvent e){
	
		count++;
		UNr = enterUNr.getText();
		enteredPW =enterPW.getText();
	
		if (!enteredPW.equals(correctPW)&& count<3){
		message.setText("Passwort falsch, Sie haben noch"+(3-count)+" \nVersuche. Neu eingeben bitte");
		//System.out.println("Passwort falsch, Sie haben noch"+(3-count)+" Versuche. Neu eingeben bitte");
		enterUNr.clear();
		enterPW.clear();
		}
	
		if (enteredPW.equals(correctPW)&&count <=3){
		message.setText("Passwort korrekt");
		//System.out.println("erfolgreich eingeloggt");
			}else{
					
					if (!enteredPW.equals(correctPW)&& count ==3 || count >3){
						message.setText("das passwort wurde 3x falsch eingegeben. bitte admin kontaktieren");
					}
			}	
	}
	
	public void closeProgram(ActionEvent e2){
		
		
		System.exit(0);
		
	}
	}
