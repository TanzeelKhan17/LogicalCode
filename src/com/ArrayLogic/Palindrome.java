package com.ArrayLogic;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int a=121;
	int	b=0;
	int c=a;
		//b=a;
		while(a!=0) {
			b=b*10+a%10;  //0*10+121%10= 12.1
			a=a/10;       //1.21
			//System.out.println(a+""+b);
			
		}
		if(b==c) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

}
