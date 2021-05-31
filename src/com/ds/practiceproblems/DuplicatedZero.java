package com.ds.practiceproblems;

public class DuplicatedZero {

	public static void main(String[] args) {
		
		int a[] = {1,0,2,3,0,4,5,0};
		int b[] = {2,0,9,1,0,2,4};
		int c[] = {0,0,9,1,0,2,4};
//		int b[] = new int[a.length];
//		int k = 0;
//		for (int i = 0; i < a.length; i++) {
//			if(a[i] == 0 && k < b.length) {
//				b[k] = a[i];
//				b[k] = a[i];
//				k++;
//			}
//			else {
//				if(k < b.length) {
//					b[k] = a[i];
//				}
//			}
//			k++;
//		}
//		
//		for(int i : a) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		for (int i : b) {
//			System.out.print(i+" ");
//		}
//		
//		System.out.println("\n\n\n");
		DuplicatedZero d = new DuplicatedZero();
		d.duplicateZeroY(c);
//		d.duplicateZeros(a);
		
		for(int i: c) {
			System.out.print(i+" ");
		}
		
	}	
	
	public void duplicateZeroY(int arr[]) {
		int zeros = 0;
		for(int i:arr) {
			if(i == 0)
				zeros++;
		}
		int i = arr.length-1, j = arr.length+zeros-1;
		
		while(i != j) {
			insert(arr, i, j--);
			if(arr[i] == 0) {
				insert(arr, i, j--);
			}
			i--;
		}
	}
	private void insert(int arr[], int i, int j) {
		if(j<arr.length) {
			arr[j] = arr[i];
		}
	}
	public void duplicateZeros(int[] arr) {
	        int possibleDups = 0;
	        int length_ = arr.length - 1;

	        // Find the number of zeros to be duplicated
	        // Stopping when left points beyond the last element in the original array
	        // which would be part of the modified array
	        for (int left = 0; left <= length_ - possibleDups; left++) {

	            // Count the zeros
	            if (arr[left] == 0) {

	                // Edge case: This zero can't be duplicated. We have no more space,
	                // as left is pointing to the last element which could be included  
	                if (left == length_ - possibleDups) {
	                    // For this zero we just copy it without duplication.
	                    arr[length_] = 0;
	                    length_ -= 1;
	                    break;
	                }
	                possibleDups++;
	            }
	        }

	        // Start backwards from the last element which would be part of new array.
	        int last = length_ - possibleDups;

	        // Copy zero twice, and non zero once.
	        for (int i = last; i >= 0; i--) {
	            if (arr[i] == 0) {
	                arr[i + possibleDups] = 0;
	                possibleDups--;
	                arr[i + possibleDups] = 0;
	            } else {
	                arr[i + possibleDups] = arr[i];
	            }
	        }
	    }
}
