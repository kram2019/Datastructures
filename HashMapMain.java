package fb.datastructures.pr;

import java.util.HashMap;
import java.util.Map;

//Hash map is one of the implementations of map which is used to store (key, value) pairs


public class HashMapMain 
{
	//"static void main" must be defined in a public class
	public static void main (String[] args)
	{
		//1. Initialize a hash map
		Map<Integer, Integer> hashmap = new HashMap<>();
		
		//2.Insert a new key value pair
		hashmap.putIfAbsent(0,0);
		hashmap.putIfAbsent(2,3);
		
		//3. Insert a new key value pair or update the value of existed key
		hashmap.put(1,1);
		hashmap.put(1,2);
		
		//4. get the value of a specific key
		System.out.println(" The value of key 1 is: " + hashmap.get(1));
		
		//5. delete a key
		hashmap.remove(2);
		
		//6. check if a key is in the hash map
		if (!hashmap.containsKey(2))
		{
			System.out.println(" Key 2 is not in the hash map");
		}
		
		//7. get the size of hash map
		System.out.println("The size of the hash map is :" + hashmap.size());
		
		//8. iterate the hash map
		for (Map.Entry<Integer, Integer> entry : hashmap.entrySet())
		{
			 System.out.print("(" + entry.getKey() + "," + entry.getValue() + ") ");
		}
		System.out.println(" are in the hash map");
		
		//9. clear the hash map
		hashmap.clear();
		
		//10. check if hash map is empty
		if (hashmap.isEmpty())
		{
			System.out.println("hash map is empty now!!!");
		}
		
		
		//11. Build a hash map using array as input with count of occurrences of each array element
		System.out.println("--------------------");
		System.out.println("Build a hash map using array as input with count of occurrences of each array element");
		
		int[] arr1 = { 1,2,3,4,5,3,1,5,3,3,3};
		System.out.println( "Input array for hash map : { 1,2,3,4,5,3,1,5,3,3,3}");
		for(int x : arr1)
		{
			if (!hashmap.containsKey(x))
			{
				hashmap.put(x,1);
			}
			else
			{
				hashmap.put(x, hashmap.get(x)+1);
			}
		}
		
		// display hash map occurrences
		for (int x : hashmap.keySet())
		{
			System.out.println( " Hashmap Key : Values are : " + x + " : " + hashmap.get(x));
		}
		
		
		
				
	}
}