package fb.datastructures.pr;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Initialize
        String s1 = "Hello World";
        System.out.println("s1 is \"" + s1 + "\"");
        String s2 = s1;
        System.out.println("s2 is another reference to s1.");
		String s3 = new String(s1);
		System.out.println("s3 is a copy of s1");
		
		// 2. compare using '=='
        System.out.println(" -- Compared by '==':");
        // true since string is immutable and s1 is binded to "Hello World"
        System.out.println("s1 and \"Hello World\": " + (s1 == "Hello World"));
       // true since s1 and s2 is the reference of the same object
        System.out.println("s1 and s2: " + (s1 == s2));
        // false since s3 is referred to another new object
        System.out.println("s1 and s3: " + (s1 == s3));
     
        // 3. Compare using 'equals'
        System.out.println(" -- Compared by 'equals':");
        System.out.println("s1 and \"Hello World\": " + s1.equals("Hello World"));
        System.out.println("s1 and s2: " + s1.equals(s2));
        System.out.println("s1 and s3: " + s1.equals(s3));
        
        //4. compare using 'compareTo'
        System.out.println(" -- Compared by 'compareTo':");
        System.out.println("s1 and \"Hello World\": " + (s1.compareTo("Hello World") == 0));
        System.out.println("s1 and s2: " + (s1.compareTo(s2) == 0));
        System.out.println("s1 and s3: " + (s1.compareTo(s3) == 0));
		
        //5. Immutable or mutable ( In java String is immutable
          //  String s1 = "Hello World";
          //  s1[5] = ',';
          //  System.out.println(s1);
        
        //6. Concatenation
        System.out.println("-- Concatenation");
        s1 += "!";
        System.out.println(s1);
        // 7. find
        System.out.println("The position of first 'o' is: " + s1.indexOf('o'));
        System.out.println("The position of last 'o' is: " + s1.lastIndexOf('o'));
       
        // 8. get substring
        System.out.println(s1.substring(6, 11));
	
        // 9. If you did want your string to be mutable, you can convert it to a char array
        String s = "Hello World";
        char[] str = s.toCharArray();
        str[5] =  ',';
        System.out.println(str);
        
        // 10. If you have to concatenate strings often, it will be better to use some other data structures like StringBuilder. 
        //The below code runs in O(n) complexity.
        int n = 3;
        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str1.append("hello" + i);
            System.out.println(str);
        }
        String ss = str1.toString();
        System.out.println(ss)	;
	
        // String Rotation
        /*
         * ASCII value ranges-
			For capital alphabets 65 – 90
			For small alphabets 97 – 122
			For digits 48 – 57
			All other cases are Special Characters.
         * 
         */
        
        String input = "OabcdMN";
        int rotationfactor = 1;
        StringBuilder result = new StringBuilder();
        
        System.out.println( "Input String : " + input);
        
        for (int i = 0; i < input.length(); ++i)
        {
        	if (input.charAt(i) >=65 && input.charAt(i) <= 90)
        	{
        		char ch = (char)(((int)input.charAt(i) + 
                		rotationfactor - 65) % 26 + 65); 
                result.append(ch); 
        		System.out.println ("upper case : " + input.charAt(i));
        		
        	}
        	else 
        	{
        		if (input.charAt(i) >= 97 &&  input.charAt(i) <= 122)
        		{
        			char ch = (char)(((int)input.charAt(i) + 
            		  	    rotationfactor - 97) % 26 + 97); 
                    result.append(ch); 
                    System.out.println ("lower case : " + input.charAt(i));
        		}
        		
        	}
        	
        }
        System.out.println("Result String : " + result);
	    
	}
	
	
	
	

}
