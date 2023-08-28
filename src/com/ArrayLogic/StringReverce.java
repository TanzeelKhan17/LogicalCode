package com.ArrayLogic;

public class StringReverce {
	public static void main(String[] args) {
		
		String s= "tanzeel";
		String rev="";
		
		char[] ch = s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}

}
