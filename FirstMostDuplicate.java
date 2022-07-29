package week3.day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstMostDuplicate {

	public static void main(String[] args) {
		/* input: abbaba
		 * output: b
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * 1) Map -> HashMap 
		 * 2) String -> ch[] -> Get all the character -> occurance
		 * 3) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
		
		String input="abbabab";
		char[] c=input.toCharArray();
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for (int i = 0; i < c.length; i++) {
			if(m.containsKey(c[i])) {
				m.put(c[i], m.getOrDefault(c[i], 0)+1);
				}
			else m.put(c[i], 1);
					
		}
		
		System.out.println(m);
		int max=0;
		char maxChar=0;
		for (Entry<Character,Integer> entry: m.entrySet())
		{
			if(entry.getValue()>max) {
				max=entry.getValue();
				maxChar=entry.getKey();
				
				
			}
		}
		System.out.println("Max occuring "+maxChar);
	}

}
