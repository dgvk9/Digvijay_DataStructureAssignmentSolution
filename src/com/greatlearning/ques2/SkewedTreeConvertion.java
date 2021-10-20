package com.greatlearning.ques2;


public class SkewedTreeConvertion {
	
	Node root;
	
	//Insert node in skewed tree
	Node Insert(Node root, int data) {
		if(root == null) {
			root = new Node(data);
		}else {
			root.right = Insert(root.right, data);
		}
		return root;
	}
	
	//Do in order traversal and call insert method
	public Node skewTree(Node node) {
		if (node == null) return node;
		skewTree(node.left);
		root = Insert(root, node.data);
		skewTree(node.right);		
		return root;
	}
	
	//Print pre order tree traversal
	public void preOrder(Node root) {
		if (root == null) return;
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);		
	}

}
