package com.ds.practiceproblems.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BruteForceStockSpan {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.println("Input the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        List<Integer> out = new ArrayList<>();

        for (int i = n-1; i >=0 ; i--) {
            int count = 0;
            for (int j = i-1; j >=0 ; j--) {
                if (arr[j] <= arr[i] ) {
                    count++;
                }
                else {
                    break;
                }
            }
            count++;
            out.add(count);
        }

        Collections.reverse(out);
        System.out.println(out);
        s.close();
    }
}
