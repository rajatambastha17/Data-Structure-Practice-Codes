package com.ds.practiceproblems;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,3,3,3,4,4,5,6,6,7,7,7,7,8,9,9,9,9,9,9,9,9,9,10,10,11,12,13,14,14,14,14,14,14};
		int n = removeDuplicates(arr);
		
		System.out.println(n);
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		int arr2[] = {1,1,2,2,2,3,3,4,5,5,6,6,7,7,7,7,7};
		int k = removeDuplicatesL(arr2);
		
		System.out.println(k);
		System.out.println();
		for(int i: arr2) {
			System.out.print(i+" ");
		}
	}
	
	public static int removeDuplicates(int arr[]) {
		
		int n = 0;
		int var =arr[0];
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<arr.length; i++) {
			if(i == arr.length-1) {
				list.add(arr[i]);
			}
			else if(arr[i] == var && arr[i] != arr[i+1]) {
				list.add(arr[i]);
				var = arr[i+1];
			}
		}	
		
		int newarr[] = new int[list.size()];
		
		for (int i : list) {
			newarr[n] = i;
			n++;
		}
		arr = newarr;
		
		return arr.length;
	}
	
	public static int removeDuplicatesL(int nums[]) {
		if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    return i + 1;
	}
}
