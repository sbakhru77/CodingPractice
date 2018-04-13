package crachCode;

public class Node {
	Node next = null;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void appendToTail(int d) {
		Node end = new Node(d);
		Node n = this;
		
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	public Node deleteNode(Node root, int d ) {
		Node n = root;
		
		// if the root or head is the data to be deleted, return the next element as the root
		if (n.data == d)
			return root.next;
		
		while (n != null) {
			n = n.next;
			if (n.data == d ) {
				n.next = n.next.next; 
			}
			
		}
				
		return root;
	}
}
