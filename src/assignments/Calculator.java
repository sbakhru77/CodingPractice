package assignments;
import java.util.Scanner;
import java.text.*;

//Code By: Sunila Bakhru

public class Calculator {

	DecimalFormat df = new DecimalFormat("###.##");
	public double number1;
	public double number2;
	public double result;
	static int operator;
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		DecimalFormat df = new DecimalFormat("###.##");
		
		CalcAPI cAPI = new CalcAPI();

		System.out.println("Please enter number1: ");
		Scanner scan = new Scanner(System.in);
		calc.number1 = scan.nextFloat();
		
		System.out.println("Please enter number2: ");
		calc.number2 = scan.nextFloat();
		
		System.out.println("You entered "+df.format(calc.number1)+ " and "+df.format(calc.number2));
		
		System.out.println("Please enter operation to be performed in int: ");
		System.out.println("Add(1), Substract(2), Multiply(3), Divide(4), Exit(0) -");
		operator = scan.nextInt();

		while (operator != 0)
		{
	
			switch(operator){
				case 1:
					calc.result = cAPI.Add(calc.number1, calc.number2);
					break;
				case 2:
					calc.result = cAPI.Subtract(calc.number1, calc.number2);
					break;
				case 3:
					calc.result = cAPI.Multiply(calc.number1, calc.number2);
					break;
				case 4:
					calc.result = cAPI.Divide(calc.number1, calc.number2);
					break;
				default:
					break;				
				}

			System.out.println("The result is: "+ df.format(calc.result));
			System.out.println("Do you want to continue?Y/N: ");
			
			if (scan.next().equals("Y"))
			{
				System.out.println("Please enter number1: ");
				calc.number1 = scan.nextFloat();
				System.out.println("Please enter number2: ");
				calc.number2 = scan.nextFloat();
				
				System.out.println("You entered "+df.format(calc.number1)+ " and "+df.format(calc.number2));
				
				System.out.println("Please enter operation to be performed in int: ");
				System.out.println("Add(1), Substract(2), Multiply(3), Divide(4) -");
				operator = scan.nextInt();			
			}
			else
			{ break; }
		
		}
	
			

	}//End of main method
	
}//End of the Class
