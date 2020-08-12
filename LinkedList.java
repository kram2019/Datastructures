package fb.datastructures.pr;

//Definition for singly-linked list.
class Node
{
	Node next; //Next Node
	int data;  // data Node
	public Node ( int data)
	{
		this.data = data;
	}
}


public class LinkedList {
	Node head;  //Head Node
	
// Append element to a link list
	public static LinkedList append( LinkedList list, int data)
	{
	    Node newnode = new Node(data); 
	         newnode.next = null; 
				
		if (list.head == null)
		{
			list.head  = newnode ;		
		}
		
		else
		{
					
			Node current = list.head;
			while (current.next != null)
			{
				current = current.next;
			}
			
			    current.next = newnode;
		}
		return list;
	}
		
		
// Prepend  element to a link list
		public static LinkedList prepend(LinkedList list, int data)
		{
			Node newHead = new Node(data);
			newHead.next = list.head;
			list.head = newHead;
			return list;
		}

		
		
// Delete  element to a link list
		public static LinkedList deletewithValue(LinkedList list,  int data)
		{
				if (list.head == null) return list;
				if (list.head.data == data)
				{
					list.head = list.head.next;
				}
					
				Node current = list.head;	
				while(current.next != null)
				{
					if (current.next.data == data)
					{
						current.next = current.next.next;
						
					}
					current = current.next;
				}
				return list;
			
		}
		
// print a link list
		public static void printlist( LinkedList list)
		{
		   Node current = list.head;	
		   System.out.println("LinkedList: "); 
		   
		   while (current != null)
		   {
			   
			   
			   //even check
			   if (current.data %2 ==0)
			   {
				   System.out.println("Even" + current.data + " "); 
			   }
			   
			   System.out.println("all" + current.data + " ");
			   current = current.next;
			   
			   //
		   }
		   System.out.println(""); 
		}
		
// Reverse a link list
		
		public static void reverselist ( LinkedList list)
		{
		    Node reversedpart = null;
			Node current = list.head;	
			System.out.println(" Reverse LinkedList: "); 
		   
		   while (current != null)
		   {
			   Node next = current.next;
			   current.next = reversedpart;
			   reversedpart = current;
			   current = next; 
			   
			   //System.out.print(reversedpart.data + " ");
			   //current = current.next;
		   }
		   System.out.println(""); 
		   System.out.println(" Reverse LinkedList: "); 
		   
		   while (reversedpart != null)
		   {
			   			   
			   System.out.print(reversedpart.data + " ");
			   reversedpart = reversedpart.next;
		   }
		   System.out.println(""); 
		   
		   
		}
		
		
		
		public static void main (String [] args)
		{
			LinkedList list = new LinkedList();
			// ******INSERTION****** 
	        // 
	  
	        // Append the values 
	        list = append(list, 7); 
	        list = append(list, 8);
	        list = append(list, 5);
	        list = append(list, 4);
	        // Print the LinkedList 
	        printlist(list); 
	        
	        list = prepend(list, 13);
	        printlist(list); 
			
			list = deletewithValue(list,8);
			printlist(list); 
			
			reverselist(list); 
			
			
			
		}
	
}
