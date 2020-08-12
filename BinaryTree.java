package fb.datastructures.pr;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


public class BinaryTree {
	
	//definition
	
	int val;
	BinaryTree left;
	BinaryTree right;
	
	public BinaryTree(int val)
	{
		this.val = val;
	}
	
	
	
	// Binary Insertion
	
	public void insert(int data)
	{
		if (data <= val)
		{
			if (left == null)
			{
				left = new BinaryTree(data);
			} else {
				left.insert(data);
			}
		} else {
			if (right == null)
			{
				right = new BinaryTree(data);
				
			}else {
				right.insert(data);
				
			}
		}
	}
	
	
	// Binary Search
	
	public boolean contains(int data)
	{
		
		if (data == val)
		{
			return true;
		}
		else if (data < val) {
			if (left == null)
			{
				return false;
			} else {
				return left.contains(data);
				
			}
			
		} else {
			if (right == null)
			{
				return false;
			} else {
				return right.contains(data);
				
			}
		}
	}

	// In order Traversal
	public void printInOrder () {
		if (left != null) {
			left.printInOrder();
		}
		System.out.print(" " + val);
		if (right != null)
		{
			right.printInOrder();
		}
	}
	
	// In PreOrder Traversal
		public void printPreOrder () {
			System.out.print(" " + val);
			if (left != null) {
				left.printInOrder();
			}
			if (right != null)
			{
				right.printInOrder();
			}
		}
		
		// In PostOrder Traversal
				public void printPostOrder () {
					if (left != null) {
						left.printInOrder();
					}
					if (right != null)
					{
						right.printInOrder();
					}
					System.out.print(" " + val);
				}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree tree = new BinaryTree(10);
		
		// Create nodes
		tree.insert(5);
		tree.insert(15);
		tree.insert(8);
		tree.insert(12);
		tree.insert(3);
		/* following is the tree after above statement 
		  
        1 
      /   \ 
    null  null     */
		
		
		
		 /* 2 and 3 become left and right children of 1 
        1 
      /   \ 
     null   2 
  /    \   /  \ 
 null null 3 null  */
		
		tree.contains(8);
		
		System.out.println ( " InOrder Traversal : ");
		tree.printInOrder();
		System.out.println();
		System.out.println ( " PreOrder Traversal : ");
		tree.printPreOrder();
		System.out.println();
		System.out.println ( " PostOrder Traversal : ");
		tree.printPostOrder();
		
	}

}


