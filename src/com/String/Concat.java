package com.String;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st String");
		String one = sc.nextLine();
		
		System.out.println("Enter 2nd String");
		String two = sc.nextLine();
		
		String three=one.concat(two);
		
		System.out.println("concat "+" "+three);
		
	}
	
	
}
