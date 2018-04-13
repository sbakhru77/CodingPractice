import java.util.Scanner;

class CalcOperator{
	public enum operator{
		ADD(1), SUBTRACT(2), MULTIPLY(3), DIVIDE(4), C(0);
		
		private int code;
		 
		private operator(int c) {
		   code = c;
		 }
		 
		 public int getCode() {
		   return code;
		 }
		 
	}	
}

public class Calculator1 {

	static double number1;
	static double number2;
	static double result;
	static int operator;
	CalcOperator cop = new CalcOperator();
	
	public static void main(String[] args) {

		System.out.println("Please enter number1: ");
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextFloat();
		System.out.println("Please enter number2: ");
		number2 = scan.nextFloat();
		
		System.out.println("You entered "+number1+ " and "+number2);
		
		System.out.println("Please enter operation to be performed in int: ");
		System.out.println("Add(1), Substract(2), Multiply(3), Divide(4), Exit(0) -");
		operator = scan.nextInt();

		//cop.op = CalcOperator.operator
		
		while (operator != 0)
		{

			switch(operator){
			case 1:
				result = Add(number1, number2);
				break;
			case 2:
				result = Subtract(number1, number2);
				break;
			case 3:
				result = Multiply(number1, number2);
				break;
			case 4:
				result = Divide(number1, number2);
				break;
			default:
				break;				
			}

			System.out.println("The result is: "+ result);

			System.out.println("Please enter number1: ");
	//		Scanner scan = new Scanner(System.in);
			number1 = scan.nextFloat();
			System.out.println("Please enter number2: ");
			number2 = scan.nextFloat();
			
			System.out.println("You entered "+number1+ " and "+number2);
			
			System.out.println("Please enter operation to be performed in int: ");
			System.out.println("Add(1), Substract(2), Multiply(3), Divide(4), Exit(0) -");
			operator = scan.nextInt();

		}
		
			

	}//End of main method
	
	public static double Add(double a, double b){
		result = a + b;
		return result;
	}

	public static double Subtract(double a, double b){
		result = a - b;
		return result;
	}
	
	public static double Multiply(double a, double b){
		result = a * b;
		return result;
	}

	public static double Divide(double a, double b){
		result = a/b;
		return result;
	}

}
