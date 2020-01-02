package com.java.programs;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String s1= "Sneha SukulSae";
		char ch[]= s1.toCharArray();
		HashMap<Character, Integer> table = new HashMap<Character, Integer>();
		
		/*Build hashtable*/
		
		for (char output : s1.toCharArray()) { 
			Integer count = table.get(output); 
			if (count == null) {
				table.put(output, 1); 
			 } 
			else { 
				table.put(output, ++count); 
			} 
		}
		System.out.println(table);
		Set<Entry<Character, Integer>> entrySet = table.entrySet();
		for (Entry<Character, Integer> entry : entrySet) 
		{
			 if (entry.getValue() > 1) {
				 System.out.printf("duplicate element '%s' and count '%d' :", entry.getKey(), entry.getValue());
			 }
		}
	}
}
