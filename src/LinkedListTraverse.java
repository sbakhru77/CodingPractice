import java.util.*;


public class LinkedListTraverse {
	
	public static void main(String args[])
	{
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.add(12);
		llist.add(3);
		llist.add(5);
		llist.add(7);
		llist.add(1);
		llist.add(4);
		llist.add(8);
		llist.add(9);
		llist.add(5);
		
		ListIterator<Integer> itr = llist.listIterator();
		
		while (itr.hasNext())
		{
			System.out.println("Linked list elements: " + itr.next());
			//System.out.println("next index: " + itr.nextIndex());
		}
	}
}
