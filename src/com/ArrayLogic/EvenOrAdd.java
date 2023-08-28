package com.ArrayLogic;

import java.util.Scanner;

public class EvenOrAdd {
	
	public static void main(String[] args) {
		while(true) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No to Check Even Or  Not");
		int prime = sc.nextInt();
		//for(int i=0;i<prime;i++) {
		if(prime % 2==0) {
			System.out.println(" Even Number");
		}else {
			System.out.println("Not Even Number");
		}
		
	}

}}
