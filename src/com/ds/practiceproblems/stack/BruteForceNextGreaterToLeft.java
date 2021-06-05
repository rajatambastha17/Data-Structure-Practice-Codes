package com.ds.practiceproblems.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BruteForceNextGreaterToLeft {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Input array elements");
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		for(int i=n-1; i>=0; i--) {
			boolean flag = false;
			for(int j=i-1; j>=0; j--) {
				if(arr[j] > arr[i]) {
					list.add(arr[j]);
					flag = true;
					break;
				}
			}
			if(flag==false) {
				list.add(-1);
			}
		}
		Collections.reverse(list);
		System.out.println(list);
	}
}
