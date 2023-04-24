package com.java;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Rep_character {
	
	public static void main(String[] args) {
		
		String s="java sql greens aws java python java sql python java greens";
		
		Map<String, Integer> m= new TreeMap<>();  //key - word - String,value-count-Integer
		
		String[] allwords = s.split(" ");
		
		for (String  word : allwords) {
			
			// System.out.println(word);
			
			if (m.containsKey(word)) {
				
				Integer count=m.get(word); //m.put(java)
				
				m.put(word, count+1);
								
			}
		else {
			
			m.put(word, 1);
	
					
				}
				
			}
		Set<Entry<String,Integer>> enterySet = m.entrySet();
		
		for (Entry<String, Integer> entry : enterySet) {
			
			if (entry.getValue()>1) {
				
				System.out.println(entry);
			}
			
		}	
		
	}

}
