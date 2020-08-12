package fb.datastructures.pr;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Scanner;

public class Spellchecker {

	
	public static void main(String[] args) throws IOException
	{
		URL url = new URL("http://andrew.cmu.edu/course/15-121/dictionary.txt");
		Scanner sc = new Scanner( url.openStream() );

		HashSet<String> dict =  new HashSet<String>();

		while( sc.hasNext() ) dict.add(sc.next());
		sc.close();

		sc = new Scanner( new File("D:/Java55/Develop/src/fb/datastructures/pr/Spellchecker.java") );
		while( sc.hasNextLine() )
		{
			String[] tokens = sc.nextLine().split("\\W");
			for(String token : tokens)
			   if (token.length() > 1 && !dict.contains(token.toLowerCase()))
			      System.out.println(token);
		}
	}
	
}
