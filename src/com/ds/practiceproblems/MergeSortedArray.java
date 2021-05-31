package com.ds.practiceproblems;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int nums1[] = {0};
		int nums2[] = {1};
		mergeSort(nums1, 0, nums2, 1);
		
		for(int i:nums1) {
			System.out.print(i+" ");
		}

	}
	
	public static void mergeSort(int nums1[], int m, int nums2[], int n) {
		
		int p1 = m-1, p2 = n-1, i = m+n-1;
		
		for(int k = i; k>=0; k--) {
			if(p2>=0) {
				if(p1 >=0 && nums1[p1] > nums2[p2]) {
					nums1[k] = nums2[p2--];
				}
				else {
					nums1[k] = nums2[p2--];
				}
			}
		}
	}
	
	public static void sortKar(int nums1[], int m, int nums2[], int n) {
		int p1 = m-1, p2 = n-1, i = m+n-1;
		
		while(p2 >= 0) {
			if(p1 >= 0 && nums1[p1] > nums2[p2]) {
				nums1[i--] = nums1[p1--];
			}
			else {
				nums1[i--] = nums2[p2--];
			}
		}
	}

}
