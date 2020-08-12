package fb.datastructures.pr;

// Add any extra import statements you may need here



public class RotationalCipher {

	
    /*
     * ASCII value ranges-
		For capital alphabets 65 – 90
		For small alphabets 97 – 122
		For digits 48 – 57
		All other cases are Special Characters.
     * 
     */
	
	

	  // Add any helper functions you may need here
	  

	  String rotationalCipher(String input, int rotationFactor) {
	    // Write your code here
		  StringBuilder result = new StringBuilder();
		  
		  
		  for (int i = 0; i < input.length() ; ++i)
		  {
			 if (input.charAt(i) >=65 && input.charAt(i) <= 90)
		        {
		        	char ch = (char)(((int)input.charAt(i) + 
		               		rotationFactor - 65) % 26 + 65); 
		            result.append(ch); 
		        }
		     else if (input.charAt(i) >= 97 && input.charAt(i) <= 122)
		        {
		        	char ch = (char)(((int)input.charAt(i) + 
		           		  	    rotationFactor - 97) % 26 + 97); 
		            result.append(ch); 
		        }
		        			        
		     else if (input.charAt(i) >= 48 && input.charAt(i) <= 57)
		       {
		    	 	char ch = (char)(((int)input.charAt(i) + 
	           		  	    rotationFactor - 48) % 10 + 48); 
		    	 	result.append(ch); 
		       }
		     else
		       {
		    	 	char ch = (char)input.charAt(i);
		    	 	result.append(ch);
		       }
			  
		  }
		  System.out.println(result.toString());
     return result.toString();
     
	}







	  // These are the tests we use to determine if the solution is correct.
	  // You can add your own at the bottom, but they are otherwise not editable!
	  int test_case_number = 1;
	  void check(String expected, String output) {
	    boolean result = (expected.equals(output));
	    char rightTick = '\u2713';
	    char wrongTick = '\u2717';
	    if (result) {
	      System.out.println(rightTick + " Test #" + test_case_number);
	    }
	    else {
	      System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
	      printString(expected); 
	      System.out.print(" Your output: ");
	      printString(output);
	      System.out.println();
	    }
	    test_case_number++;
	  }
	  void printString(String str) {
	    System.out.print("[\"" + str + "\"]");
	  }
	  
	  public void run() {
	    String input_1 = "All-convoYs-9-be:Alert1.";
	    int rotationFactor_1 = 4;
	    String expected_1 = "Epp-gsrzsCw-3-fi:Epivx5.";
	    String output_1 = rotationalCipher(input_1, rotationFactor_1);
	    check(expected_1, output_1);

	    String input_2 = "abcdZXYzxy-999.@";
	    int rotationFactor_2 = 200;
	    String expected_2 = "stuvRPQrpq-999.@";
	    String output_2 = rotationalCipher(input_2, rotationFactor_2);
	    check(expected_2, output_2);
	    
	 
	    // Add your own test cases here
	    String input_3 = "Zebra-493";
	    int rotationFactor_3 = 3;
	    String expected_3 = "Cheud-726";
	    String output_3 = rotationalCipher(input_3, rotationFactor_3);
	    check(expected_3, output_3);
	    
	    String input_4 = "abcdefghijklmNOPQRSTUVWXYZ0123456789";
	    int rotationFactor_4 = 39;
	    String expected_4 = "nopqrstuvwxyzABCDEFGHIJKLM9012345678";
	    String output_4 = rotationalCipher(input_4, rotationFactor_4);
	    check(expected_4, output_4);
	    
	  }
	  
	  public static void main(String[] args) {
	    new RotationalCipher().run();
	  }
	}	
	
	
	
	

