package com.String;

import java.util.HashMap;
import java.util.Map;

public class PracticeCountString {
	
	public static void main(String[] args) {
		
		
		String s= "Java is Platform Indipendent";
	
//static	String s="Hello My name is Tanzeel Khan And I am A Developer";

//	
//	public static void getCount(String s) {
//		Map<Character, Integer> c= new HashMap<>();
//		char[] ca = s.toCharArray();
//		for(char ch:ca) {
//			ch=Character.toLowerCase(ch);
//			if(c.containsKey(ch)) {
//				
//
//				c.put(ch,c.get(ch)+1);
//			}
//				else {
//
//					c.put(ch, 1);
//				
//			}
//		}
//		System.out.println(s+":"+c);
//	}
//	
//	public static void main(String[] args) {
//		getCount(s);
//	}
//}
	
//	2 Format
//	for(char ch='a';ch<='z';ch++) {
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			if(ch==s.charAt(i)) {
//				count++;
//			}
//		}
//		if(count!=0) {
//			System.out.println(ch+":"+count);
//		}
//	}
//	
//	3 Tarika
		
		HashMap<Character, Integer> hm= new HashMap<>();
		char[]c=s.replaceAll(" ","").toCharArray();
		
		for(Character ch:c) {
			ch = Character.toLowerCase(ch);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
			
		}
//		for(Map.Entry<Character, Integer>m:hm.entrySet()) 
		{
//		for(Map.Entry<Character,Integer>m:hm.entrySet())

			System.out.println(hm);
		}
		
		
		}
	}
	
//	 Practice 


	
	
	
	
	
	
	
	
