package HackerRank;

public class BSTChecker {
	
	boolean checkBST(Node root) {
		if (root == null || (root.left == null && root.right == null))
			return true;
		else
			return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	boolean isBST(Node node, int min, int max) {
		if (node == null)
			return true;
		else {
			if (node.data < min || node.data > max)
				return false;
			else
				return (isBST(node.left, min, node.data) && isBST(node.right, node.data, max));
		}
	}
	
	public static void main(String args[]) {
		BSTChecker bs = new BSTChecker();
		
		Node root = new Node(4);
		root.left = new Node(2);
		root.right =  new Node(7);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right.left = new Node(5);
		root.right.right = new Node(8);
		root.right.left.right = new Node(6);
		root.right.left.left = new Node(4);

		System.out.println(bs.checkBST(root));
	}
}


class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}