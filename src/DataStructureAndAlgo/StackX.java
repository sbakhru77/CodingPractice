package DataStructureAndAlgo;

// Most microprocessors use stack base architecture. Older pocket calculators used stack 
public class StackX {

	private char[] stackArr;
	private int maxSize;
	private int top;
	
	public StackX(int max) {
		maxSize = max;
		stackArr = new char[maxSize];
		top = -1;
	}
	
	//push an item on top of stack
	public void push(char str) {
		stackArr[++top] = str;
	}
	
	//pop an item to stack
	public int pop() {
		return stackArr[top--];
	}
	
	//peek or lookup the top item
	public int peek() {
		return stackArr[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//Reverse a string
	public String doReverse(String input) {
		String output="";
		
		for(int i = 0; i< input.length(); i++) {
			push(input.charAt(i));
		}
		
		while(!isEmpty()) {
			output = output + pop();
		}
		
		return output;
		
	}
}
