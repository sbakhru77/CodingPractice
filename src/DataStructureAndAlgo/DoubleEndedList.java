package DataStructureAndAlgo;

public class DoubleEndedList {
	private Link2 first;
	private Link2 last;
	
	public DoubleEndedList() {
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertLast(long d) {
		Link2 newLink = new Link2(d);
		
		if (isEmpty())
			first = newLink;
		else
			last.next = newLink;
		
		last = newLink;
	}
	
	public long deleteFirst() {
		long temp = first.data;
		
		if (first.next == null) //only one item in list
			last = null;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		Link2 current = first;
		
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		
		System.out.println(" ");
		
	}
}
