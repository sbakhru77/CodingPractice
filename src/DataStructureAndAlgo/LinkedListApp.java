package DataStructureAndAlgo;

public class LinkedListApp {
	public static void main(String args[]) {
		
		LinkedList ll = new LinkedList();
		
		ll.insertFirst("Sunila", "Bakhru", 40);
		ll.insertFirst("Sanaa", "Bakhru", 10);
		ll.insertFirst("Sunil", "Bakhru", 42);
		ll.insertFirst("Rohan", "Bakhru", 10);
		ll.insertFirst("XXX", "Bakhru", 10);

		ll.displayList();
		
		Link first = ll.deleteFirst();
		
		System.out.println("Deleted " + first);
		
		ll.displayList();
		
		Link fname = ll.find("Rohan");
		
		if (fname == null)
			System.out.println("Sorry could not find " + fname.fname);
		else
			System.out.println("Found person name " + fname.fname + " " + fname.lname);
		
		ll.displayList();
		
		Link del = ll.delete("Rohan");
		
		if (del == null)
			System.out.println("Sorry could not find " + del.fname);
		else
			System.out.println("Deleted " + del.fname);
		
		ll.displayList();
	}
}
