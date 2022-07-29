package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 

		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 

		 * g) Displaying the String without duplicate words
		 * 
		 * Collections-using List and Set

			The pseudocode has steps to implement using arrays.
			But, now do the same set of programs using Collections.	
		 */

		String text="We learn java basics as part of java sessions in java week1";
		String[] c=text.split(" ");
		Set<String> output=new LinkedHashSet<String>();
		for (int i = 0; i < c.length; i++) {
			output.add(c[i]);

		}
		System.out.print("The duplicates removed:"+output);
	}

}
