package Calculator;


/**business logik*/
public class Model {
	
	
	
	
		
	static public long calculate (long num1, long num2, String operator){
		
		long result=0;
		
		if (operator.equals("+")){
			result=num1+num2;
		}
		
		if (operator.equals("-")){
			result=num1-num2;
		}
		
		if (operator.equals("X")){
			result=num1*num2;
		}
		if (operator.equals("/")){
			result=num1/num2;
		}
		if (operator.equals("=")){
			result=num1/num2;
		}
		
		return result;
		
		
	}
	
	
	

}
