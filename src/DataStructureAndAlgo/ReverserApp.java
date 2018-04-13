package DataStructureAndAlgo;

public class ReverserApp {
	public static void main(String args[]) {
		String str = "Hi There!";
		int strLen = str.length();
		String out;
		
		StackX stack = new StackX(strLen);
		
		out = stack.doReverse(str);
		
		System.out.println("Input String: " + str);
		System.out.println("Reversed String: " + out);
	}
}
