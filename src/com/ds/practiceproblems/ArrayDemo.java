package com.ds.practiceproblems;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
//		long p = 5;
		int a[] = new int[3];
		
		int i = 0;
		while(i < a.length) {
			a[i] = i*1+10;
			i++;
		}
		for (int aa : a) {
			System.out.println(aa);
		}
		int b[] = {4,582,59,664,25842,6687,48};
		Arrays.sort(b);
		System.out.println();
		for(int aa : b) {
			System.out.print(aa+" ");
		}
		
		int maximum = maximumElement(b);
		System.out.println("\nMax element is : "+maximum);
	}
	
	public static int maximumElement(int arr[]) {
		
		
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i] > max) {
				max=arr[i];
			}
		}
		
		return max;
	}

}
