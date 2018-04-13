package LeetCode;

//Given an array where elements are sorted in ascending order, convert it to a height balanced BST
//For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never 
//differ by more than 1.

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class ConvertSortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0)
			return null;
		
        TreeNode head = getBST(nums, 0, nums.length-1);
      
        return head;
    }
	
	public TreeNode getBST(int[] nums, int start, int end) {
		if(start > end)
			return null;
		
        int midlen = (start+end)/2;

		TreeNode head = new TreeNode(nums[midlen]);
		
		head.left = getBST(nums,start, midlen-1);
		head.right = getBST(nums,midlen+1, end);
		
		return head;
	}
	
	 public static void main(String[] args) {
		 ConvertSortedArrayToBST tree = new ConvertSortedArrayToBST();
	     int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
	     
	     TreeNode root = tree.sortedArrayToBST(arr);
	     tree.preOrder(root);
	 }
	 
	 /* A utility function to print preorder traversal of BST */
	    void preOrder(TreeNode node) {
	        if (node == null) {
	            return;
	        }
	        System.out.print(node.val + " ");
	        preOrder(node.left);
	        preOrder(node.right);
	    }
}
