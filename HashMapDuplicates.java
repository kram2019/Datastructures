package fb.datastructures.pr;

import java.util.HashMap;

// Add any extra import statements you may need here


	public class HashMapDuplicates {

	  // Add any helper functions you may need here
	 
 
	  int  numberOfWays(int[] arr, int k) {
	    // Write your code here
   
		  int count = 0;
	    HashMap <Integer, Integer> map = new HashMap<> ();
	  
	    //Build Map 
	    for ( int x : arr)
	    {
	    	if (!map.containsKey(x))
	    	{
	    		map.put(x, 1);
	    	}
	    	else
	    	{
	    		map.put(x, map.get(x)+1);
	    	}	
	    	System.out.println(" Hash Map values occurrences - " + x + " : "+ map.get(x) + "----");
	    	
	    	if (map.containsKey(k - x))
    		{
	    	
	    		if (map.get(x) == 1) 
	    			{
	    			 count ++;
	    			}
	    		 else
	    		 {
	    	    	count = count + ((x*(x-1))/2);
	    		 }
	    	}
	    }
	    	    
	    //Display Map
    	    
	    for (int x : map.keySet())
	    {	
	    	if(map.get(x) > 1)
	    	{
	    		System.out.println(" Duplicate occurrences - " + x + " : "+ map.get(x) );	
	    	}
	    }
	    
		 return count/2; 
    
		} 
		  
	  /*
	   * 
	    int[] counts = new int[1005];
	    for (int p : ps)
            counts[p]++;
	   *
	   * is same as 
	   * 
	   * for(int k = 0; k < ps.length; k++)
          {
		    int p = ps[k];
		      counts[p]++;
		  }
	   * 
	   */



	  // These are the tests we use to determine if the solution is correct.
	  // You can add your own at the bottom, but they are otherwise not editable!
	  int test_case_number = 1;
	  
	  void check(int expected, int output) {
	    boolean result = (expected == output);
	    char rightTick = '\u2713';
	    char wrongTick = '\u2717';
	    if (result) {
	      System.out.println(rightTick + " Test #" + test_case_number);
	    }
	    else {
	      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
	      printInteger(expected); 
	      System.out.print(" Your output: ");
	      printInteger(output);
	      System.out.println();
	    }
	    test_case_number++;
	  }
	  
	  void printInteger(int n) {
	    System.out.print("[" + n + "]");
	  }
	  
	  public void run() {
	  
		 
		int k_1 = 6;
	    int[] arr_1 = {1, 2, 3, 4, 3};
	    int expected_1 = 2;
	    int output_1 = numberOfWays(arr_1, k_1);
	    check(expected_1, output_1);
        

	    int k_2 = 6;
	    int[] arr_2 = {1, 5, 3, 3, 3};
	    int expected_2 = 4;
	    int output_2 = numberOfWays(arr_2, k_2);
	    check(expected_2, output_2);

	    
	    // Add your own test cases here
	    
	  }
	  public static void main(String[] args) {
	    new HashMapDuplicates().run();
	  }
	}
	

