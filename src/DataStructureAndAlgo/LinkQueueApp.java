package DataStructureAndAlgo;

public class LinkQueueApp {
	
	public static void main(String args[]) {
		LinkQueue queue = new LinkQueue();
		queue.insert(5);
		queue.insert(10);
		queue.insert(15);
		
		queue.displayQueue();
		
		queue.insert(20);
		queue.insert(25);

		queue.displayQueue();
		
		queue.remove();
		queue.remove();

		queue.displayQueue();

	}

}
