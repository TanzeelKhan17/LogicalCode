package com.String;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int no,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check Prime or Not");
		no = sc.nextInt();
		
		for(i=2;i<no;i++) {
			if(no%i==0) {
				System.out.println("Not Prime Number");
				break;
			}
		}
		if(no==i)
		{
			System.out.println("Prime Numberr");
		}
	}

}
