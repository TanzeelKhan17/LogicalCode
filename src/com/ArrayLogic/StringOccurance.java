package com.ArrayLogic;

import java.util.HashMap;

public class StringOccurance {
	public static void main(String[] args) {
		
		String s="Tanzeel Khan Software Developer";
		
		HashMap<Character,Integer> has= new HashMap<>();
		
		char[] ch = s.replaceAll(" ","").toCharArray();
		
		for(Character c:ch) {
			if(has.containsKey(c)) {
				has.put(c,has.get(c)+1);
			}else {
				has.put(c,1);
			}
		}
		System.out.println(has);
		
	}

}
