package com.sunbeam;

public class BSTree {

	static class Node {

		private int data;
		private Node left;
		private Node right;

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}

	private Node root;

	BSTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		Node newnode = new Node(value);

		if (isEmpty()) {
			root = newnode;
		} else {
			Node trav = root;
			while (true) {
				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = newnode;
						break;
					} else
						trav = trav.left;
				} else {
					if (trav.right == null) {
						trav.right = newnode;
						break;
					} else
						trav = trav.right;
				}

			}

		}

	}

	public void preOrder(Node trav) {
		if (trav == null)
			return;
		System.out.print(trav.data + " ");
		preOrder(trav.left);
		preOrder(trav.right);
	}

	public void inOrder(Node trav) {
		if (trav == null)
			return;
		inOrder(trav.left);
		System.out.print(trav.data + " ");
		inOrder(trav.right);
	}

	public void postOrder(Node trav) {
		if (trav == null)
			return;
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(trav.data + " ");
	}

	public void inOrder() {
		System.out.print("Inorder : ");
		inOrder(root);
		System.out.println("");
	}

	public void postOrder() {
		System.out.print("Postorder :");
		postOrder(root);
		System.out.println("");
	}

	public void preOrder() {
		System.out.print("Preorder :");
		preOrder(root);
		System.out.println("");
	}

	public Node binarySearch(int key) {
		Node trav = root;
		while (trav != null) {
			if (key == trav.data)
				return trav;
			else {
				if (key < trav.data) {
					trav = trav.left;
				} else
					trav = trav.right;
			}
		}
		return null;
	}

	public Node[] binarySearchParent(int key) {
		Node trav = root;
		Node parent = null;
		while (trav != null) {

			if (key == trav.data)
				break;
			parent = trav; //

			if (key < trav.data)
				trav = trav.left;

			else
				trav = trav.right;
		}

		if (trav == null)
			parent = null;
		return new Node[] { trav, parent };
	}

//	@Override
//	public String toString() {
//		return "BSTree [root=" + root + "]";
//	}

	public Node search(int key, Node node) {
		Node trav = root;
		return trav;
	}
    
	public void deleteNode(int key) {
		
		Node ret[] = binarySearchParent(key);
		Node temp = ret[0], parent = ret[1];
		
		if(temp == null)
			return;
		
		if(temp.left != null && temp.right != null){
			
			Node suc = temp.right;
			parent = temp;
			while(suc.left != null){
				parent = suc;
				suc = suc.left;
			}
			temp.data = suc.data;	
			temp = suc;
		}
	
		if(temp.left == null){
			if(temp == root)				
				root = temp.right;
			else if(temp == parent.left)	
				parent.left = temp.right;
			else if(temp == parent.right)
				parent.right = temp.right;

		}
		
		else {
			if(temp == root)				
				root = temp.left;
			else if(temp == parent.left)	
				parent.left = temp.left;
			else if(temp == parent.right)	
				parent.right = temp.left;
		}
	}
	public Node getroot() {
		return root;
	}
	
	 int getLeafCount(Node node) 
	    {
	        if (node == null)
	            return 0;
	        if (node.left == null && node.right == null)
	            return 1;
	        else
	            return getLeafCount(node.left) + getLeafCount(node.right);
	    }
	  
	public int getNonLeafCount(Node node) 
	    {
	        if (node == null || (node.left ==null && node.right==null))
	            return 0;
	        else
	            return 1 + getLeafCount(node.left) + getLeafCount(node.right);
	    }
	
	 public  Node insert(Node root, int key)
	    {
	       
	        if (root == null) {
	            return new Node(key);
	        }
		       
	        if (key < root.data) {
	            root.left = insert(root.left, key);
	        }
	 	      
	        else {
	           
	            root.right = insert(root.right, key);
	        }
	 
	        return root;
	    }
	 
	
}
