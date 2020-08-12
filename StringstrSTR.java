package fb.datastructures.pr;


public class StringstrSTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String haystack = "mississiissiissippi" ;
		String needle = "issip" ;

		
		/*
		 * Input: haystack = "hello", needle = "ll" , * Output: 2
         * Input: haystack = "aaaaa", needle = "bba", * Output: -1
		 */
		
		int hstk = haystack.length();
		int ndle = needle.length();
		
		if (ndle == 0 ) { 
			System.out.println (-1);
			//return -1;
		}
		
		int posn = 0;
		while (posn < hstk - ndle + 1 ) 
		{
			while ((posn < hstk - ndle + 1 ) && (haystack.charAt(posn) != needle.charAt(0)))
					{
						posn++;             //pos of first needle character
					}
			
			int hposn = posn;
			int nposn = 0;
			while ((hposn < hstk) && (nposn < ndle) && (haystack.charAt(hposn) == needle.charAt(nposn)))
				{
					hposn++;
					nposn++;
					posn ++;
				}
		
		
			if (nposn == ndle)
			{
					System.out.println(posn - nposn);
				//	posn = hstk - ndle + 1;
					
					//return posn;
			}
			else
			{
				posn = posn - nposn + 1  ;
				System.out.println(posn);
			}
			
		}
			
		
		
		System.out.println(-1);
		//return -1;
		
	}

}
