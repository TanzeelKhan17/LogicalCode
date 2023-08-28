package com.ArrayLogic;

import java.util.Scanner;

public class PrimeNummber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter No to Check Prime Or Not");
		
		int prime = sc.nextInt();
		int i=0;
		for( i=2;i<prime;i++) {
			if(prime%i==0) {
				System.out.println("Not A prime Number");
				break;
			}
		}
		if(i==prime) {
			System.out.println("prime Number");
		}
	}
	

}}
