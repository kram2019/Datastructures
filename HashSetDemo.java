package fb.datastructures.pr;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetDemo {

	
	public static void main(String[] args)
	   {
	      String[] colors = {"white", "pink", "red", "green", "red", "orange","Aa","BB"};

	      HashSet<String> hs = new HashSet<String>();

	      for(int i = 0; i < colors.length; i++)  hs.add(colors[i]);

	      System.out.println(hs);

	      System.out.println("Does it contain green?  " + hs.contains("green"));
	      
	      Iterator<String> itr = hs.iterator();

	      while(itr.hasNext())
	         System.out.print(itr.next()+" ");
	      System.out.println();


	      for(String str : hs)
	         System.out.print(str +" ");
	      System.out.println();
	      
	      System.out.println("Does it contain black?  " + hs.contains("black"));

	   }
}
