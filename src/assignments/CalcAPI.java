package assignments;
//Code By: Sunila Bakhru

public class CalcAPI {

	private double result;
	
	public double Add(double a, double b){
		result = a + b;
		return result;
	}

	public double Subtract(double a, double b){
		result = a - b;
		return result;
	}
	
	public double Multiply(double a, double b){
		result = a * b;
		return result;
	}

	public double Divide(double a, double b) throws ArithmeticException  {
		if(b==0) {
			throw new ArithmeticException();
		}
		
		result = a/b;
		
		return result; 
	}

}
