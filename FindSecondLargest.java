package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7};

				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				int[] d= {3,2,11,4,6,7};
								
				List<Integer> list= new ArrayList<Integer>();
				for (int i = 0; i < d.length; i++) {
					list.add(d[i]);			
				}				
				Collections.sort(list);
				
				System.out.println("List elements sorted: "+list);
				
				int output=list.get(list.size()-2);
			
				System.out.println("Second Largest Element is : "+output);
	}

}
