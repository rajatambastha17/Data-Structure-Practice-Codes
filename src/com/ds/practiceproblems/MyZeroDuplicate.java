package com.ds.practiceproblems;

public class MyZeroDuplicate {

	public static void main(String[] args) {
		
		int arr[] = {1,0,2,3,0,4,5,0};
		
		duplicateZero(arr);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}
	
	public static void duplicateZero(int arr[]) {
		int copy[] = new int[arr.length];
		int i = 0;
		for(int e : arr) {
			if(e != 0 && i<arr.length) {
				copy[i] = e;
				i++;
			}
			else {
				if(i<arr.length)
					copy[i] = e;
				if(i+1 < arr.length) {
					copy[i+1] = e;
					i++;
				}
				i++;
			}
		}
		i=0;
		for(int e: copy) {
			arr[i] = e;
			i++;
		}
	}
}
