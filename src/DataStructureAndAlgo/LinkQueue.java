package DataStructureAndAlgo;

public class LinkQueue {
	private DoubleEndedList list;
	
	public LinkQueue() {
		list = new DoubleEndedList();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void insert(long d) {
		list.insertLast(d);
	}
	
	public long remove() {
		return list.deleteFirst();
	}
	
	public void displayQueue() {
		System.out.println("Queue front ---> rear : ");
		list.displayList();
	}
}
