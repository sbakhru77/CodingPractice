package HackerRank;

import java.util.*;
import java.util.LinkedList;
import java.util.Stack;;


public class Tree {
	
	 class Node {
	    int data;
	    Node left;
	    Node right;  
	 }
	 
	//Preorder (Root, Left, Right)
	void preOrderRecursive(Node root) {
		if (root==null)
			return;
		
		System.out.print(root.data + " ");
		preOrderRecursive(root.left);
		preOrderRecursive(root.right);
		
	}
	
	//Preorder (Root, Left, Right)
	void preOrder(Node root) {
		if (root==null)
			return;
		
		Stack<Node> nodeStack = new Stack<Node>();
		nodeStack.push(root);
		
		while (!nodeStack.isEmpty()) {
			Node node = nodeStack.pop();
			
			if (node.right!=null)
				nodeStack.push(node.right);
			
			if (node.left != null)
				nodeStack.push(node.left);
			
			System.out.print(node.data + " ");
		}
	}
	
	//Postorder (Left, Right, Root)
	void postOrderRecursive(Node root) {
	    if (root == null)
	        return;
	     
	    postOrderRecursive(root.left);
	    postOrderRecursive(root.right);
	     
	    System.out.print(root.data + " ");
	}
	
	void postOrder(Node root) {
		Stack<Node> nodeStack = new Stack<Node>();
		Stack<Node> postStack = new Stack<Node>();
		
		nodeStack.push(root);
		
		while (!nodeStack.isEmpty()) {
			Node node = nodeStack.pop();
			postStack.push(node);
			
			if (node.left != null)
				nodeStack.push(node.left);
			
			if (node.right!=null)
				nodeStack.push(node.right);				
		}
		
		while(!postStack.isEmpty()) {
			System.out.print(postStack.pop().data + " ");
		}
	}
	
	
	//Inorder (Left, Root, Right) 
	void inOrderRecursive(Node root) {
		if (root == null)
	        return;
		
		inOrderRecursive(root.left);
		System.out.print(root.data + " ");
		inOrderRecursive(root.right);		 
	}
	
	void inOrder(Node root) {
		if (root == null)
	        return;
		
		Node node = root;
		Stack<Node> nodeStack = new Stack<Node>();
		
		while (node != null) {
			nodeStack.push(node);
			node = node.left;
		}
		
		while(!nodeStack.isEmpty()) {
			node = nodeStack.pop();
			System.out.print(node.data + " ");
			
			if(node.right != null) {
				node =  node.right;
			
				while (node != null) {
					nodeStack.push(node);
					node = node.left;
				}	
			}
		}
	}
	
	static int height(Node root) {
		if (root == null)
			return -1;
		
		int leftHt = height(root.left);
		int rightHt = height(root.right);
		
		if (leftHt > rightHt)
			return leftHt+1;
		else
			return rightHt+1;
		
	}
	
	void levelOrder(Node root) {
		
		if (root==null)
			return;
		
		Queue<Node> nodeQueue = new LinkedList<Node>();

		nodeQueue.add(root);

		while (!nodeQueue.isEmpty()) {
			Node parent = nodeQueue.poll();
			
			System.out.print(parent.data + " ");
			
			if(parent.left != null)
				nodeQueue.add(parent.left);
			
			if(parent.right != null)
				nodeQueue.add(parent.right);

		}
	      
    }
	
	class QItem {
		Node treeNode;
		int hd;
		
		public QItem(Node n, int h) {
			treeNode = n;
			hd = h;
		}
	}
	
	void topView(Node root) {
		if (root==null)
			return;
		
		Queue<QItem> nodeQueue = new LinkedList<QItem>();
		HashSet<Integer> set = new HashSet<>();
	    
       nodeQueue.add(new QItem(root, 0));
	    
	    while (!nodeQueue.isEmpty()) {
	    	QItem parentQ = nodeQueue.remove();
	    	Node parent = parentQ.treeNode;
	    	int h = parentQ.hd;
	    	
	    	if (!set.contains(h)) {   
	    		set.add(h);
	    		System.out.print(parent.data + " ");
	    	}
	    	
	    	if(parent.left != null) {
	    		nodeQueue.add(new QItem(parent.left, h-1));
	    	}
			
			if(parent.right != null) {
				nodeQueue.add(new QItem(parent.right, h+1));
			}	
      
	    }
    }
	
	Node Insert(Node root,int value) {

		Node newNode = new Node();
		newNode.data = value;
		
		if (root == null)
			return newNode;
	       
		Node current = root;
		Node parent = root;
		
		while (true) {
			parent = current;
			
			if (value < current.data) {
				current = current.left;
				
				if (current == null) {
					parent.left = newNode;
					return root;
				}
			}
			else {
				current = current.right;
				
				if (current == null) {
					parent.right = newNode;
					return root;
				}
			}
		}
    }
	
	//Lowest common ancestor
	static Node lca(Node root,int v1,int v2)
    {
		if (root == null)
			return root;
		
		if(v1<root.data && v2<root.data) 
			return lca(root.left,v1,v2);
		
		if(v1>root.data && v2>root.data)
			return lca(root.right,v1,v2);
		
		return root;
       
    }

//	static Node lca_binaryTree(Node root,int v1,int v2)
//    {
//
//       return root;
//    }
	
	
	   boolean checkBST(Node root) {
	        if (root == null)
	        	return true;
	        
	        if (root.left != null) {
	        	if (root.left.data > root.data) {
	        		return false;
	        	}
	        }
	        
	        if (root.right != null) {
	        	if (root.data > root.right.data) {
	        		return false;
	        	}
	        }
	        
	        if (!checkBST(root.left) || !checkBST(root.right))
	        	return false;
	        
	        return true;
	   }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        Node root = null;
//        while(t-- > 0){
//            int data = scan.nextInt();
//            root = insert(root, data);
//        }
//        scan.close();
//        int height = height(root);
//        System.out.println(height);
//    }
	
}
