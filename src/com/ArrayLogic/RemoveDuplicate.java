package com.ArrayLogic;

import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		String s="abcdegabcdef";
		
		HashSet<Character> has = new HashSet<>();
		char[] c = s.toCharArray();
		
		for(Character ch:c) {
			has.add(ch);
		}
		
		System.out.println(has);
		
		
		
		
		
		
		
	}

}
