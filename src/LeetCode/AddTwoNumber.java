package LeetCode;

import java.util.LinkedList;
import java.util.List;

import DataStructureAndAlgo.Link;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8


public class AddTwoNumber {
	public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
		LinkedList result = new LinkedList();
		
		int carry = 0;
		
		while (l1 != null || l2 != null) {
			int x = (l1 != null) ? (int) l1.getFirst() : 0;
			int y = (l2 != null) ? (int) l2.getFirst() : 0;
			
			int sum = x + y + carry;
			
			carry = sum / 10;
			
			result.add(sum%10);
		
			//if (l1 != null) l1 = l1.
		}
		
		
		return null;
    }
	
	public LinkNode addTwoNumbers(LinkNode l1, LinkNode l2) {
		LinkNode dummyHead = new LinkNode(0);
		LinkNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.num : 0;
	        int y = (q != null) ? q.num : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new LinkNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new LinkNode(carry);
	    }
	    return dummyHead.next;
	}
	
	public static void main(String args[]) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1.addFirst(3); l1.addFirst(4); l1.addFirst(2);
		l2.addFirst(4); l2.addFirst(6); l2.addFirst(5);
		
		List result = new LinkedList();
		result = addTwoNumbers(l1, l2);
		
		System.out.println(result);
	}
}
