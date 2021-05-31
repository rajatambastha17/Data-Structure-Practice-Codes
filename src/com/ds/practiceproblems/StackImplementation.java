package com.ds.practiceproblems;

import java.util.Scanner;

public class StackImplementation {
    int top;
    int arr[] = new int[100];
//    public static void main(String args[]) {
//        
//        StackImplementation stack = new StackImplementation();
//        System.out.println(stack.isEmpty());
//        int i = 1;
//        Scanner sc = new Scanner(System.in);
//        while(i != -1) {
//            System.out.print("Enter a value to push: ");
//            int element = sc.nextInt();
//            stack.push(element);
//            i = sc.nextInt();
//        }
//
//        stack.displayStack();
//        stack.pop();
//        stack.push(53);
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.displayStack();
//        System.out.println("Top most element: "+stack.peek());
//        System.out.println("Size of stack: "+stack.size());
//        sc.close();
//    }

    public StackImplementation() {
        this.top = -1;
    }

    public void push(int element) {
        if(top < 0) {
            arr[++top] = element;
        }
        else {
            if(top+1 >= arr.length) {
                System.out.println("Stack Overflow!");
                displayStack();
                throw new StackOverflowError("Cannot insert element, stack size reached!");                
            }
            else {
                arr[top+1] = element;
                top++;
            }
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Nothing to pop, Stack is empty!");
        }
        else {
            top--;
        }
    }

    public boolean isEmpty() {
        if(top < 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void displayStack() {
        System.out.print("Stack[Last element printed first] --> ");
        for(int i=top; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public int size() {
    	return top+1;
    }
    
    public int peek() {
        return arr[top];
    }
}