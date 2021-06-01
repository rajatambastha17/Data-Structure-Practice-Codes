package com.ds.practiceproblems.stack;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;

public class NextLargestElementUsingStackCollection {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array --> ");
        int n = s.nextInt();
        System.out.println();

        int arr[] = new int[n];
        System.out.println("Enter elements separated by spaces --> ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        List<Integer> output = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = n-1; i >=0; i--) {
            if(stack.isEmpty()) {
                output.add(-1);
            }
            else if(!stack.isEmpty() && stack.peek() > arr[i]) {
                output.add(stack.peek());
            }
            else if(!stack.isEmpty() && stack.peek() <= arr[i]) {
                while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    output.add(-1);
                }
                else {
                    output.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        Collections.reverse(output);
        System.out.println(output);
        s.close();
    }
    
}