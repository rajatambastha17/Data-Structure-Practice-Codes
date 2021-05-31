package com.ds.practiceproblems;

public class Demo {
	
	public static void main(String[] args) {
		int num = 12345678;
		
		int count = countDigits(num);
		System.out.println(count);
	}
	
	public static int countDigits(int num) {
		
		int count = 0;
		if(num < 10) {
			return ++count;
		}
//		int quotient = num%10;
		
		num = num/10;
		count++;
		return count+countDigits(num);
	}
	
}
