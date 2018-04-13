package assignments;

import java.util.ArrayList;

public class GetFactorialValue {
	
	public static void main(String[] args) {
		Factorial fac = new Factorial();
	
		//System.out.println("The factorial value of 3 is " + fac.recursiveFactorial(3));
		System.out.println("The factorial value of 6 is " + fac.recursiveFactorial(6));
		fac.iterativeFactorial(6);
	}
}

class Factorial {

	int recursiveFactorial(int num)
	{
		int result;
		
		System.out.println("value of num is " + num);
		
		if (num == 1)
			return 1;
		result = recursiveFactorial(num-1) * num;
		return result;
	}
	
	
	void iterativeFactorial(int num) {
		int facresult = 1;
//		ArrayList<Integer> facArr = new ArrayList<Integer>();
		
		while (num > 0) {
			//facArr.add(num);
			facresult = num * facresult;
			num--;
		}
		
//		for(int i : facArr) {
//			facresult = i * facresult;
//			System.out.println(i);
//		}
		
		System.out.println(facresult);
	}
}

