package assignments;

import java.util.LinkedList;

public class ReverseLinkedList {

	static LinkedList<Integer> numbers = new LinkedList<Integer>();
	static LinkedList<Integer> reversedNumbers = new LinkedList<Integer>();
	
	public static LinkedList<Integer> reverse(LinkedList<Integer> ll, int i) {
		
		//int i = ll.size()-1;
		
		if (ll.isEmpty())
			return new LinkedList<Integer>();
		
		if (i<0)
			return reversedNumbers;
		
		reversedNumbers.add(ll.get(i));
		//calls the method recursively to reverse the list
		return reverse(ll, i-1);
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i<50; i++) {
			numbers.add(i);
		}
		
		System.out.println("numbers in linked list " + numbers);
		System.out.println("number of linked list in reverse order " + reverse(numbers, numbers.size()- 1));
		
	}
	
	
}
