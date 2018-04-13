package HackerRank;

import java.util.HashMap;

public class LinkedList {
	class Node {
	     int data;
	     Node next;
	     Node prev;
	}
	
	void Print(Node head) {
		if (head != null) {
		      while(head.next != null) {
		        System.out.println(head.data);
		        head = head.next;
		      }
		      System.out.println(head.data);
		  }
	}
	
	Node InsertAtEnd(Node head,int data) {
		Node newNode = new Node();

		newNode.data = data;	
		newNode.next = null;
		
		if (head == null) {
			return newNode;
		}
		
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		return head;
		
	}
	
	Node InsertAtBeginning(Node head,int x) {
	    Node newNode = new Node();
	    
	    newNode.data = x;
	    newNode.next = head;
	    
	    if (head == null) {
	    	return newNode;
	    }
	    
	    head = newNode;
	    return head;
	}

	/*
	  Insert Node at a given position in a linked list 
	  head can be NULL 
	  First element in the linked list is at position 0
	  */
	
	Node InsertNth(Node head, int data, int position) {
		Node newNode = new Node();
		int i = 0;
		newNode.data = data;
		
		if (position == 0) {
		    newNode.next = head;
		    
		    return newNode;
		}
		
		Node current = head;
		Node previous = head;
		
		while (i != position) {
			previous = current;
			current = current.next;
			i++;
		}
		
		previous.next = newNode;
		newNode.next = current;
		 
		return head;
	}
	
	// delete the node at the position and return the head node
	Node Delete(Node head, int position) {
		if (head == null)
			return head;
		
		if (position == 0)
			return head.next;
		
		int i = 0;
		Node current = head;
		Node previous = head;
		
		while (i != position) {
			previous = current;
			current = current.next;
			i++;
		}
		
		previous.next = current.next;
		
		return head;
	}

	//Recursive way to print reverse of linked list
	void ReversePrint(Node head) {
		if (head == null)
			return;
		
		ReversePrint(head.next);
		System.out.println(head.data + " ");
	}
	
	//reverse a linked list
	Node Reverse(Node head) {
		if (head == null)
			return head;
		
		Node previous = null;
		Node current = head;
		Node next = null;
		
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			
		}
		//Reverse(head.next);
		head = previous;
		
		return head;
		
	}
	
	Node RecursiveReverse(Node head) {
		if(head == null)
			return head;
		
		Node first = head.next;
		RecursiveReverse(head.next);
		
		return first;
	}

	// Compare two linked list and return 1 if they are exactly same size with same data. Else return 0
	int CompareLists(Node headA, Node headB) {
		if ((headA == null && headB != null) || (headA != null && headB == null) )
			return 0;
		
		while(headA!=null && headB!=null) {
			if(headA.data != headB.data)
				return 0;
			
			headA = headA.next;
			headB = headB.next;
			
		}
		
		if  (headA == null && headB == null)
			return 1;
		else
			return 0;
	}
	
	/*
	  Merge two linked lists - implemented recursively
	  head pointer input could be NULL as well for empty list
	*/
	Node mergeLists(Node headA, Node headB) {
		Node mergedNode = new Node();
		
		if (headA == null && headB != null)
			return headB;
		
		if (headA != null && headB == null)
			return headA;
		
//		while(headA!=null && headB!=null) {
//			if (headA.data > headB.data) {
//				while (headA.data > headB.data) {
//					mergedNode.data = headB.data;
//					headB = headB.next;
//					mergedNode = mergedNode.next;
//				}
//			}
//			else {
//				while (headB.data > headA.data) {
//					mergedNode.data = headB.data;
//					headA.next = headA.next;
//					mergedNode = mergedNode.next;
//				}
//			}
//			headA = headA.next;
//			headB = headB.next;
//		}
		
		if (headA.data <= headB.data) {
			mergedNode = headA;
			mergedNode.next = mergeLists(headA.next, headB);
		}
		else {
			mergedNode = headB;
			mergedNode.next = mergeLists(headA, headB.next);
		}
		
		return mergedNode;
	}
	
	//Find the data at node n from the tail of the linked list
	int GetNode(Node head,int n) {
	     int len = 0;
	     Node temp = head;
	     
	     while (head != null) {
	    	 if (len > n)
	    		 temp = temp.next;
	    	 
	    	 len++;
	    	 head = head.next;
	     }
	     
	     return temp.data;

	}
	
	Node RemoveDuplicates(Node head) {
		if (head == null)
			return head;

		Node prev = head;
		Node current = head.next;
		
		while (current != null) {
			
			if (prev.data == current.data) {
				prev.next = current.next;	
			}
			else {
				prev = current;
			}	
			
			current = current.next;
			
		}
		
		return head;
	}
	
//	Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
//  A linked list is said to contain a cycle if any node is visited more than once while traversing the list.


	boolean hasCycle(Node head) {
		if (head == null)
			return false;
		
		Node slow = head;
		Node fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast)
				return true;
		}
		
		return false;
	}
	
//	boolean hasCycle(Node head) {
//	    if (head == null) return false;
//	    
//	    Node slow = head;
//	    Node fast = head.next;
//	    
//	    while(slow != fast) {
//	        if (fast == null || fast.next == null)
//	            return false;
//	        
//	        slow = slow.next;
//	        fast = fast.next.next;
//	    }
//	    
//	    return true;
//	}

	
	/*
	  Find merge point of two linked lists
	  head pointer input could be NULL as well for empty list
	*/
	int FindMergeNode(Node headA, Node headB) {
	    
		if(headA == headB)
			return headA.data;
		
		HashMap<Node, Integer> llMap = new HashMap<Node, Integer>();
		
		while(headA!=null){
			llMap.put(headA, headA.data);
			headA = headA.next;
		}
		
		while(headB!=null) {
			if(llMap.containsKey(headB))
				return headB.data;
			else
				headB = headB.next;
		}
		
		return -1;
	}

	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  
	*/

	Node SortedInsert(Node head,int data) {
	  
		Node newNode = new Node();
		newNode.data = data;
        newNode.next = null;
    
		if(head==null) {
			return newNode;
		}
		
		Node currentNode = head;
		
		while(currentNode != null) {
			if (currentNode.data >= newNode.data) {
				newNode.prev = currentNode.prev;
				newNode.next = currentNode;
				currentNode.prev = newNode;
				
				if (newNode.prev == null)
					return newNode;
				else {
					newNode.prev.next = newNode;
					return head;
				}
			}
			
            if (currentNode.next == null){
				newNode.prev = currentNode;
				currentNode.next = newNode;
                break;
			}
			currentNode = currentNode.next;
		}
			
		return head;
		
	}

	/*
	  Reverse a doubly linked list
	*/

	Node ReverseDoubleLL(Node head) {

		if(head==null) {
			return head;
		}
		
		while (head!=null) {
			Node node = head.prev;
			head.prev = head.next;
			head.next = node;
			
			if (head.prev == null)
				return head;
			
			head = head.prev;
		}
		
		return head;
	}
	
	public static void main(String args[]) {
		
        LinkedList list = new LinkedList();
		
		
	}
	
	

}
