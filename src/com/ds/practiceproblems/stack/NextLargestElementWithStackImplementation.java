package com.ds.practiceproblems.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NextLargestElementWithStackImplementation {
    
    public static void main(String args[]) {
        NextLargestElementWithStackImplementation nextLargest = new NextLargestElementWithStackImplementation();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values to be inserted into array, separated by space: ");
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        List<Integer> output = nextLargest.nextLargestElement(arr);
        System.out.println(output);
        s.close();
    }

    public List<Integer> nextLargestElement(int arr[]) {
        List<Integer> largestToLeft = new ArrayList<>();
        StackImplementation stack = new StackImplementation();

        //Check whether the array is empty
        for(int i = arr.length-1; i>=0; i--) {
            if(stack.isEmpty()) {
                largestToLeft.add(-1);
            }
            else if(stack.size() > 0 && stack.peek() > arr[i]) {
                largestToLeft.add(stack.peek());
            }
            else if(stack.size() > 0 && stack.peek() <= arr[i]) {
                while(!stack.isEmpty() && stack.peek() <= arr[i] ) {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    largestToLeft.add(-1);
                }
                else {
                    largestToLeft.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        Collections.reverse(largestToLeft);
        return largestToLeft;
    }
}