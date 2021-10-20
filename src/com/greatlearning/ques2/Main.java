package com.greatlearning.ques2;

public class Main {

	public static void main(String[] args) {
		
		Node root, skewedNode;
		
		root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.left.right = new Node(40);
		
		
		
		
		SkewedTreeConvertion tree = new SkewedTreeConvertion();
		
		//Print current tree structure
		System.out.println("BST before:");
		tree.preOrder(root);
		
		System.out.println("==========");
		
		//Skew the tree
		skewedNode = tree.skewTree(root);
		
		//Print structure post tree is skewed
		System.out.println("BST after:");
		tree.preOrder(skewedNode);
	
	}

}
