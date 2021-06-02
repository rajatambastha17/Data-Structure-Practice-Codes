package com.ds.practiceproblems;

public class BinaryNumberUsingRecursion {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(binary(999999999));
		System.out.println(sb.reverse().toString());
		
		String consec[] = sb.reverse().toString().split("0");
		int longestSeq = 0;
		for(int i = 0; i < consec.length; i++) {
			if(longestSeq < consec[i].length()) {
				longestSeq = consec[i].length();
			}
		}
		System.out.println(longestSeq);
	}
	
	public static String binary(int num) {
		if(num <= 1) {
			return String.valueOf(num);
		}
		
		int quotient = num / 2;
		int remainder = num % 2;
		String str = String.valueOf(remainder) + binary(quotient);
		return str;
	}
	
}
