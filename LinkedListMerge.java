package fb.datastructures.pr;



public class LinkedListMerge {

	//**
	 //* Definition for singly-linked list.
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
	
		    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		    	 ListNode mergelist = new ListNode (-1);
		         ListNode current = null;
		         
		         current = mergelist;
		         
		         while ((l1 != null) && (l2 != null))
		         {
		             if (l1.val <= l2.val)
		             {
		                 current.next = l1;
		                 l1 = l1.next;
		             }
		             else
		             {
		                 current.next = l2;
		                 l2 = l2.next;
		             }
		             current = current.next;
		         }
		         
		         if (l1 == null)
		         {
		             current.next = l2;       
		         }
		         else 
		         { 
		             current.next = l1;
		         }
		         return mergelist.next;
		    }
		
	    
	 //create Linked List
	    ListNode createLinkedList(int[] arr) {
		    ListNode head = null;
		    ListNode tempHead = head;
		    for (int v : arr) {
		      if (head == null) {
		        head = new ListNode(v);
		        tempHead = head;
		      } else {
		        head.next = new ListNode(v);
		        head = head.next;
		      }
		    }
		    
		    return tempHead;
		    
		  }
	    
	    
	    public void run() {
	  	  
		    int[] arr_1 = {1, 2, 3, 4, 5};
		    int[] arr_2 = {1, 3, 4, 6, 7, 8};
		    ListNode head_1 = createLinkedList(arr_1);
				    
		    ListNode head_2 = createLinkedList(arr_2);
		    
		    ListNode merge = mergeTwoLists(head_1, head_2);

		    System.out.println( " ");
		    System.out.println ( "merged list : ");
		    while (merge != null)
		    {
		    	System.out.print( " " + merge.val);
		    	merge = merge.next;
		    }
		    
		  }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LinkedListMerge().run();
	}

}
