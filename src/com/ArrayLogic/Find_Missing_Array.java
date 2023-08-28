package com.ArrayLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Missing_Array {
	public static void main(String[] args) {
		int arr[]= {1,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		int sum1=0;
		for(int j=1;j<=5;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1-sum);
	}

}
