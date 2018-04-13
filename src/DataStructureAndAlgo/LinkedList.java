package DataStructureAndAlgo;

public class LinkedList {
	private Link first;
	
	public LinkedList() {
		first = null;
	}
	
	public boolean isEmpty() {
		
		return (first == null);
	}
	
	public void insertFirst(String fname, String lname, int age) {
		Link newlink = new Link(fname, lname, age);
		newlink.next = first;
		first = newlink;
	}
	
	public Link find(String fname) {
		Link current = first;
		
		while (current.fname != fname) {
			
			if (current.next == null)
				return null; //not found
			else
				current = current.next;
		}
		
		return current;
	}
	
	public Link delete(String fname) {
		Link current = first;
		Link previous = first;
		
		while(current.fname != fname) {
			
			if (current.next == null)
				return null;  //not found
			else {
				previous = current;
				current = current.next;
			}
			
			if (current==first)
				first = first.next;
			else
				previous.next = current.next;
		}
		
		return current;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List{Name --> age }");
		Link current = first;
		
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}
