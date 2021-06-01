package com.ds.practiceproblems.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NextSmallestElementToRightUsingStack {

	public static void main(String[] args) {
		
		NextSmallestElementToRightUsingStack nextSmallest = new NextSmallestElementToRightUsingStack();
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values to be inserted into array, separated by space: ");
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        List<Integer> output = nextSmallest.nextSmallestToRight(arr);
        System.out.println(output);
        s.close();

	}
	
	public List<Integer> nextSmallestToRight(int arr[]) {
		
		List<Integer> outputList = new ArrayList<Integer>();
		StackImplementation stack = new StackImplementation();
		
		for(int i = arr.length-1; i>=0; i--) {
			if(stack.isEmpty()) {
				outputList.add(-1);
			}
			else if(!stack.isEmpty() && stack.peek() < arr[i]) {
				outputList.add(stack.peek());
			}
			
			else if(!stack.isEmpty() && stack.peek() >= arr[i]) {
				while(!stack.isEmpty() && stack.peek() >= arr[i]) {
					stack.pop();
				}
				if(stack.isEmpty()) {
					outputList.add(-1);
				}
				else {
					outputList.add(stack.peek());
				}
			}
			stack.push(arr[i]);
		}
		Collections.reverse(outputList);
		return outputList;
	}

}
