package LeetCode;

//Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
public class DeleteNodeLinkedList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public void deleteNode(ListNode node) {
        if (node.next != null) {
        	node.val = node.next.val;
        	node.next = node.next.next;
        }
        	
    }
}
