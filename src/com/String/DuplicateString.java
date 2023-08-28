package com.String;

import java.util.HashSet;

public class DuplicateString {
	public static void main(String[] args) {
		
		String s="abababcdefghi";
		HashSet<Character> has = new HashSet<>();
		char[] ch = s.toCharArray();
		for(Character c:ch) {
			has.add(c);
		}
		System.out.println(has);
	}

}
