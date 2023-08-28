package com.ArrayLogic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxNumber {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,55,60,5,6,7,8};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);

}}
