package fb.datastructures.pr;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreOrder {

	class Node
	{
		int data;
		Node left;
		Node right;
		
		 Node()
		{
			this.data = 0;
			this.left = null;
			this.right = null;
		}
		 
		 Node (int data)
		 {
			 this.data = data;
			 this.left = null;
			 this.right = null;
		 }
	}
	
	
	// Pre Order Traversal using Stack  Iterative 
	public void preorderTraversal(Node root)
	{
		List<Integer> result = new ArrayList<>();
		
		Stack<Node> st = new Stack<>();
		
		if (root != null)
		{
			st.push(root);
		}
		
		Node current;
		
		while(!st.empty())
		{
			current = st.pop();
			result.add(current.data);
			System.out.println(result);
			
			if (current.right != null)
			{
				st.push(current.right);
			}
			
			if (current.left != null)
			{
				st.push(current.left);
			}
			
		}
			
			
		}
		
		
	 // Recursive PreOrder traversal
	  public List<Integer> preorderTraversalR(Node root)
		{
		  List<Integer> result = new ArrayList<>();
		  preorderTraversalR(root, result);
		  
		  return result;
		}
	  
	   private void preorderTraversalR(Node root, List<Integer> result)
	   { 
		  if (root == null)
		  {
			  System.out.println(" Empty Tree");
			  //return
		  }
		   result.add(root.data);					//visit the root
		   System.out.println(result);
		   if (root.left != null)
		   {
			   preorderTraversalR(root.left, result);	//traverse left subtree
		   }
		   if (root.right != null)
		   {
			   preorderTraversalR(root.right, result);	//traverse right subtree
		   }
		}
		
	
	 public void run() throws IOException {
		    
		    Node root_1 = new Node(8); 
		    root_1.left = new Node(3); 
		    root_1.right = new Node(10); 
		    root_1.left.left = new Node(1); 
		    root_1.left.right = new Node(6); 
		    root_1.right.right = new Node(14); 
		    root_1.left.right.left = new Node(4); 
		    root_1.left.right.right = new Node(7); 
		    root_1.right.right.left = new Node(13); 
		    System.out.println ( " Test Case 1");
		    System.out.println ( " PreOrder Traversal Iterative");
		    preorderTraversal(root_1);
		    System.out.println();
		    System.out.println ( " Pre Order  Traversal Recurrsive");
		    preorderTraversalR(root_1);
	//	    inorderTraversal(root_1);
		    System.out.println();
		    System.out.println ( " Post Order Traversal");
	//	    postorderTraversal(root_1);
		    
		    /*
		    Node root_2 = new Node(10); 
		    root_2.left = new Node(8);
		    root_2.right = new Node(15);
		    root_2.left.left = new Node(4);
		    root_2.left.left.right = new Node(5);
		    root_2.left.left.right.right = new Node(6);
		    root_2.right.left = new Node(14);
		    root_2.right.right = new Node(16);
		    System.out.println ( " Test Case 2");
		    System.out.println ( " PreOrder Traversal");
		    preorderTraversal(root_2);
		    System.out.println ( " InOrder Traversal");
		    inorderTraversal(root_1);
		 */
		  
		    // Add your own test cases here
		    
		  }
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new BinaryTreePreOrder().run();
	}

}
