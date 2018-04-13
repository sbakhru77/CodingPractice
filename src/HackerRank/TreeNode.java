package HackerRank;

public class TreeNode {
	   // Members
    int data;
    TreeNode left, right;
 
    // Constructor
    public TreeNode(int key)
    {
        this.data = key;
        left = right = null;
    }


    static void goLeft(TreeNode node) {
	    if(node.left != null) {
	        goLeft(node.left);
	    }
	    System.out.print(node.data + " ");
	}

	static void goRight(TreeNode node) {
	    System.out.print(node.data + " ");
	    
	    if(node.right != null) {
	        goRight(node.right);
	    }
	}

	static void top_view(TreeNode root) {
	    if(root.left != null) {
	        goLeft(root.left);
	    }
	    
	    System.out.print(root.data + " ");
	    
	    if(root.right != null) {
	        goRight(root.right);
	    }
	}
	
    public static void main(String[] args)
    {
        /* Create following Binary Tree
             1
           /  \
          2    3
           \
            4
             \
              5
               \
                6*/
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);
       
        System.out.println("Following are nodes in top view of Binary Tree");
        top_view(root);
    }
}
