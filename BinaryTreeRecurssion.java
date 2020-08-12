package fb.datastructures.pr;

	import java.io.*; 
	import java.util.*;
	// Add any extra import statements you may need here

	public class BinaryTreeRecurssion {
		
	  class Node {
	    int data; 
	    Node left; 
	    Node right; 
	    
	    Node() {
	      this.data = 0; 
	      this.left = null; 
	      this.right = null; 
	    }
	    Node(int data) {
	      this.data = data; 
	      this.left = null; 
	      this.right = null; 
	    }
	  }
	  
	  
	  // Recursive PreOrder traversal
	  public List<Integer> preorderTraversal(Node root)
		{
		  List<Integer> result = new ArrayList<>();
		  preorderTraversal(root, result);
		  
		  return result;
		}
	  
	   private void preorderTraversal(Node root, List<Integer> result)
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
		   preorderTraversal(root.left, result);	//traverse left subtree
		   }
		   if (root.right != null)
		   {
		   preorderTraversal(root.right, result);	//traverse right subtree
		   }
		}
		  
	   
	// Recursive InOrder traversal
		  public List<Integer> inorderTraversal(Node root)
			{
			  List<Integer> result = new ArrayList<>();
			  inorderTraversal(root, result);
			  
			  return result;
			}
		  
		   private void inorderTraversal(Node root, List<Integer> result)
		   { 
			  if (root == null)
			  {
				  System.out.println(" Empty Tree");
				  //return
			  }
			   
			   if (root.left != null)
			   {
			   inorderTraversal(root.left, result);   //traverse left subtree
			   }
			   
			   result.add(root.data);					// visit the root
			   System.out.println(result);
			   
			   if (root.right != null)
			   {
			   inorderTraversal(root.right, result);		// traverse right subtree
			   }
			}
			  
	// Recursive PostOrder Traversal
		   
		   public List<Integer> postorderTraversal(Node root)
		   {
			   	List<Integer> result = new ArrayList<>();
			   	postorderTraversal(root, result);
			   	
			   	return result;
		   }
			   
		   private void postorderTraversal(Node root, List<Integer> result)
		   {
			   if (root == null)
			   {
				   System.out.println(" Empty Tree");
					  //return
			   }
			   
			   if (root.left != null)
			   {
				   postorderTraversal(root.left, result);
			   }
			   if (root.right != null)
			   {
				   postorderTraversal(root.right, result);
			   }
			   
			   result.add(root.data);
			   System.out.println(result);
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
	    System.out.println ( " PreOrder Traversal");
	    preorderTraversal(root_1);
	    System.out.println();
	    System.out.println ( " InOrder Traversal");
	    inorderTraversal(root_1);
	    System.out.println();
	    System.out.println ( " Post Order Traversal");
	    postorderTraversal(root_1);
	    
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
	    new BinaryTreeRecurssion().run();
	  }
	}
	
	

