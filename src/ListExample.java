import java.util.*;

public class ListExample {
	public static void main(String args[]) {
		List list = new ArrayList();

		list.add("Behara");
		list.add("Eswar");
		list.add("Ganaesh");
		list.add("Eswar");
		list.add("Charan");
		
		System.out.println(list);
		System.out.println("2: " + list.get(2));
		System.out.println("0: " + list.get(0));
		
		LinkedList queue = new LinkedList();
		
		queue.addFirst("Behara");
		queue.addFirst("Eswar");
		queue.addFirst("Ganaesh");
		queue.addFirst("Eswar");
		queue.addFirst("Charan");
		
		System.out.println(queue);
		
		queue.removeLast();
		queue.removeLast();
		
		System.out.println(queue);
	}
}