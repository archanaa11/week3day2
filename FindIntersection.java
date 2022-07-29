package week3.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int[] a1={3,2,11,4,6,7};
		int[] a2= {1,2,8,4,9,7};
		List<Integer> s1=new ArrayList<Integer>();
		List<Integer> s2=new ArrayList<Integer>();
		Set<Integer> output=new LinkedHashSet<Integer>();
		for (int i = 0; i < a1.length; i++) {
			s1.add(a1[i]);			
		}
		System.out.println(s1);
		for (int i = 0; i < a2.length; i++) {
			s2.add(a2[i]);			
		}
		System.out.println(s2);
		for (int i = 0; i < s1.size(); i++) 
		{
			for (int j = 0; j < s2.size(); j++) 
			{
							
				if(s2.contains(s1.get(i)))
					output.add(s1.get(i));
				
			}
		}
		System.out.println("The common values in both the array :"+output);

	}

}
