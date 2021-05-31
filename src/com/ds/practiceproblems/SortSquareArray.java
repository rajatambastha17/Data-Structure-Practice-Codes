package com.ds.practiceproblems;

public class SortSquareArray {

	public static void main(String[] args) {
		
		int arr[] = {-3,-2,4,1,8,6};
		
		arr = sortArray(arr);
		
		for(int i:arr) {
			System.out.print(i+ " ");
		}
	}

	public static int[] sortArray(int arr[]) {
		
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
