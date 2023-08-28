package com.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PracticeFrequency {
	
	public static void main(String[] args) {
		String s="SOftware Developer SOftware Developer";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] c = s.replaceAll(" ", "").toCharArray();
		
		for(Character ch:c) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else
			{
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);
		
	}

}


/// Find Duplicate In String

class Duplicate{
	
	public static void main(String[] args) {
		String s="abcdab";
		char[] c = s.toCharArray();
		HashSet< Character> has= new HashSet<>();
		for(Character ch:c) {
			has.add(ch);
		}
		Iterator<Character> itr = has.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}

class Prime{
	
	public static void main(String[] args) {
		
		int no,i;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The No To Ckeck Prime Or Not");
		no=sc.nextInt();
		
		for(i=2;i<no;i++) {
			if(no%i==0) {
				System.out.println("Not a prime  Number");
				break;
			}
		}if(no==i) {
			System.out.println("prime Number2");
		}
		
		
		
		
		
		
		
		
	}}














