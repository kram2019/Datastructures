package fb.datastructures.pr;

public class FindPivotIndex {

	 public int pivotIndex(int[] nums) 
	 {
		 int asum = 0;
		 int bsum = 0;	
			for (int x : nums)
			{
			  asum += x;	
			}
			
			for (int i = 0; i < nums.length; ++i)
			{			
				if (bsum == (asum - bsum - nums[i]))
				{				
					System.out.println( " Index : " + i );
					return i;
				}   
             bsum += nums[i];
			} 
	        
	        return -1;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr_1 = {1, 7, 3, 6, 5, 6};;
		new FindPivotIndex().pivotIndex(arr_1);
		
		}

}
