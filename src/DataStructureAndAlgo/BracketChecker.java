package DataStructureAndAlgo;

public class BracketChecker {
	private String input;
	
	public BracketChecker(String in) {
		input = in;
	}
		
	public void check() {
		StackX stack = new StackX(input.length());
		
		for (int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			switch(ch) {
			case '{':
			case '[':
			case '(':
				stack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if (!stack.isEmpty()) {
					char poppedVal = stack.pop();
				
					if((poppedVal=='}' && ch!='{') || (poppedVal==']' && ch!='[') || (poppedVal==')' && ch!='('))
						System.out.println("Error " + ch + "found at " + i);
				}
				else
					System.out.println("Error " + ch + "found at " + i);
				break;
			default:
				break;
			}
		}
		
		if(!stack.isEmpty()) {
			System.out.println("Error: missing right delimiter");			
		} 
	
	}

}
