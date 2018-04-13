
class Add{
	int num1;
	int num2;
	
	Add(int a, int b){
		num1 = a;
		num2 = b;		
	}
	
	public String toString(){
		int sum = num1+num2;
		return "The sum of the numbers "+num1+" and "+num2
				+" is: "+sum;		
	}
}

public class StringTest {
	
	public static void main(String[] args) {
		Add aObj = new Add(3,7);

		String str = "SUM: " + aObj;
		
		System.out.println(aObj);
		System.out.println(str);
		
		
		
		String s1 = new String("Sunila");
		char chArr[] = s1.toCharArray();
		System.out.println(chArr);
		String s2 = "Sunila";
		String s3 = new String("Sunila");
		
		if (s1.equals(s2))
			System.out.println("string equal");
		
		if (s1==s2)
			System.out.println("s1==s2");
		
		if (s1==s3)
			System.out.println("s1==s3");
		
		if (s1.equals(s3)) 
			System.out.println("s1 equals s3");
	}

}
