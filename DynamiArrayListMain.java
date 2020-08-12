package fb.datastructures.pr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * List <data-type> list1= new ArrayList();  
 * List <data-type> list2 = new LinkedList();  
 * List <data-type> list3 = new Vector();  
 * List <data-type> list4 = new Stack();  
 * 
 * The ArrayList class implements the List interface. 
 * It uses a dynamic array to store the duplicate element of different data types. 
 * The ArrayList class maintains the insertion order and is non-synchronized.
 * The elements stored in the ArrayList class can be randomly accessed.
 * 
 * Array List - Dynamic array which is still a random access list data structure
 * 
 */

public class DynamiArrayListMain {
	public static void main (String[] args)
	{
	
		// 1. Initialize 
		List<Integer> v0 = new ArrayList<>();
		List<Integer> v1;							//v1 = null;
		
		// 2. cast an array 
		Integer a[] = {0, 1, 2, 3, 4};
		v1 = new ArrayList<>(Arrays.asList(a));
		
		// 3. Make a copy
		List<Integer> v2 = v1;                      // reference to v1
		List<Integer> v3 = new ArrayList<>(v1);     // make an actual copy of v1
	
		// 4. get length
		System.out.println("The Size of v1 is " + v1.size());
		System.out.println("The Size of v1 is " + v0.size());
		
		// 5. access elements
		System.out.println(" The first element in v1 is : " + v1.get(0));
		
		// 6. Iterate
		System.out.print("[Version 1] The contents of v1 are:");
		for (int i = 0; i < v1.size(); ++i)
		{
			System.out.println(" " + v1.get(i));
		}
		System.out.println();
		System.out.print("[Version 2] The contents of v1 are:");
		for ( int item : v1)
		{
			System.out.println( " " + item);
		}
		System.out.println();
		
		// 7. modify element
		v2.set(0, 5); 				// modify v2 will actually modify v1
		System.out.println(" The first element of v1 is :" + v1.get(0));
		v3.set(0,-1);
		System.out.println(" The first element of v1 is :" + v1.get(0));
		
		// 8. sort
		Collections.sort(v1);
		
		// 9. Add new element
		v1.add(-1);
		v1.add(1, 6);
		
		// 10. Delete the last element
		v1.remove(v1.size() - 1);
			
		
		
	}
	
}
