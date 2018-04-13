
public class RemoveDuplicate {

	public static String RemoveDup(String input) {
		int len = input.length();
		boolean isDup = false;
		
		char charArr[] = input.toCharArray();
		
		StringBuffer outSB = new StringBuffer();
		
		for(int i = 0; i<len-1; i++) {
		
			if ((input.charAt(i) == input.charAt(i+1)) && isDup==false) {
				outSB.append(input.charAt(i+1));
				isDup = true;
			}
			else {
				isDup = false;
			}
		}
		
		return outSB.toString();
	}
	
	
	public static void main(String args[]) {
		final String inputStr = "aaafgelkkmnzz";
	
		String newStr = RemoveDup(inputStr);
		System.out.println("New string without duplicates ========" + newStr);
	}
	
}

