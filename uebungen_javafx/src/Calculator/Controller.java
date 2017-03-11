package Calculator;

import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
	
	
	Logger logger= Logger.getLogger("");
	private String current="";
	private long val1;
	private long val2;
	private boolean ready= false;
	private boolean ready2= false;
	private String operator="";
	private String showText="";
	
	
	@FXML
	private Label message = new Label();
	
	//@FXML//nötig, damit ausgabe im label erscheint...methodenaufruf ist ja wie ein button, welcher geklickt wird. anstatt
	//die buttons zu taggen wird die methode getaggt
	public void processNumbers (ActionEvent e) {
		
		//nur so kann Text vom aktuell gedrückten Button geholt werden
		current+=((Button)e.getSource()).getText();
		message.setText(current);
		
		if(!ready){
		val1 = Integer.parseInt(message.getText());
		ready=true;
		}else{
			val2 = Integer.parseInt(((Button)e.getSource()).getText());
			ready2=true;
		}
		
	}
	
	//@FXML
	public void processOperator(ActionEvent e) {
		
		
		if(ready2){
			
			
			System.out.println("operator "+operator);
			System.out.println(val1+" "+val2);
			val1= Model.calculate(val1, val2, operator);
			System.out.println(val1);
		}
		
	
		current = ((Button)e.getSource()).getText();
		message.setText(current);
		operator = message.getText();
		if (operator.equals("=")){
			System.out.println(operator);	
			message.setText(Long.toString(val1));
		}
		
		} 
		
		
	}


