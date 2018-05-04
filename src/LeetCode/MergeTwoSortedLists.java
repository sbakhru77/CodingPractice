package LeetCode;

public class MergeTwoSortedLists {
	
	//16ms 
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
        	return null;
        
        if (l1 == null && l2 != null)
        	return l2;
        
        if (l2 == null && l1 != null)
        	return l1;
        
        ListNode mergedNode, temp;

        if (l1.val <= l2.val) {
        	temp = new ListNode(l1.val);
        	l1 = l1.next;
        }
        else {
        	temp = new ListNode(l2.val);
        	l2 = l2.next;
        }
        mergedNode = temp;
        
        while (l1 != null && l2 != null) {
        	if (l1.val <= l2.val) {
        		temp.next = l1;
        		l1 = l1.next;
        		temp = temp.next;
        	}
        	else {
        		temp.next = l2;
        		l2 = l2.next;
        		temp = temp.next;
        	}
        }
        
        if (l1 != null) 
        	temp.next = l1;
        
        if (l2!=null)
        	temp.next = l2;
        
        return mergedNode;
        
    }

	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }	      
	}
}

