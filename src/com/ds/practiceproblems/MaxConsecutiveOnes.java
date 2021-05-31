package com.ds.practiceproblems;

import java.util.Stack;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		
		int arr[] = {1,1,0,1,1,1};
		
		int maxCount = maxConsecutiveOnes(arr);
		
		System.out.println(maxCount);
		
		Stack<Integer>stack = new Stack<>();
		stack.push(23);
		stack.push(45);
		stack.push(11);
		
		System.out.println(stack.peek());		
	}
	
	public static int maxConsecutiveOnes(int arr[]) {
		
		int one = 1;
		int maxCount = 0;
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
			else {
				if(count > maxCount) {
					maxCount = count;
					count = 0;
				}
				else {
					count = 0;
				}
			}
		}
		if(count > maxCount) {
			maxCount = count;
		}
		
		return maxCount;
	}
}
