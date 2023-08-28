package com.String;

import java.util.HashMap;

public class StringOccurance {
	
	public static void main(String[] args) {
		String s="Khan Tanzeel Software Developer";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		char[] ch = s.replaceAll(" ", "").toCharArray();
			
		for(Character c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
