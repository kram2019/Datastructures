package fb.datastructures.pr;

public class StringAddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "1010";
		String b = "1011101"; 	
			
		StringBuilder result = new StringBuilder();
		//String a + b :		Output: "10101"
		int b1 = Integer.parseInt(a, 2); 
		int b2 = Integer.parseInt(b, 2); 
		int sum1 = b1 + b2; 
		System.out.println( " String a = 1010");
		System.out.println( " String b = 1011");
		System.out.println (" Expected Output : " + Integer.toBinaryString(sum1));

		//-----------
		
		int i = a.length() - 1, j = b.length() - 1, carry = 0;
		while (i >= 0 || j >= 0) 
		{
			int sum = carry;
			if (j >= 0)
				sum += b.charAt(j--) - '0';
			if (i >= 0)
				sum += a.charAt(i--) - '0';
			result.append(sum % 2);
			carry = sum / 2;
		}
		if (carry != 0)
		{
			result.append(carry);
		}
		
		//System.out.println( " Final output  : " + result.toString());
		//return result.reverse().toString()
		System.out.println( " Final Output  : " + result.reverse().toString());
	}

}
