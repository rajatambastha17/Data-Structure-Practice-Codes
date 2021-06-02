package com.ds.practiceproblems;

public class Recursion {
	
	public static void main(String[] args) {
		System.out.println(summation(5));
		System.out.println(factorial(5));
		System.out.println(exponential(5, 4));
	}
	
	public static int summation(int n) {
		
		if(n < 1) {
			return 0; 
		}
		
		return n + summation(n-1);
	}
	
	public static int factorial(int n) {
		
		if(n<=1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
	
	public static int exponential(int n, int p) {
		
		if(p<=0) {
			return 1;
		}
		
		return n * exponential(n, p-1);
	}
}
