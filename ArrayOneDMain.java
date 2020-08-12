package fb.datastructures.pr;

import java.util.Arrays;

public class ArrayOneDMain {
	
	public static void main (String[] args)
	{
		// 1. Initialize array
		int[] a0 = new int [5];
		int[] a1 = { 1,2,3};
		
		//2. Get Length
		System.out.println("The size of a0 is: " + a0.length);
		System.out.println("The size of a1 is: " + a1.length);
		
		//3. Access Element
		System.out.println(" The value of the element at index 0/first element :" + a1[0]);
		
		//4. Iterate all elements
		System.out.print("[Version 1] The contents of a1 are:");
		for(int i = 0; i < a1.length; ++i)
		{
			System.out.println(" " + a1[i]);
		}
		
		System.out.println();
		System.out.print("[Version 2] The contents of a1 are:");
		for(int item : a1)
		{
			System.out.println(" " + item);
		}
		System.out.println();
		
		//5. Modify array element
		a1[0] = 4;
		
		//6. Sort array elements
		Arrays.sort(a1);
		
		
	}

}
