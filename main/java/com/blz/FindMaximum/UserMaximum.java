package com.blz.FindMaximum;

import java.util.*;

public class UserMaximum {

	public static Scanner sc = new Scanner(System.in);

	public static Integer findMaximum(Integer x, Integer y, Integer z) {
		int max = 0;
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			max = x;
			System.out.println(x + " is the maximum number");
		} else if (z.compareTo(y) > 0 && z.compareTo(x) > 0) {
			System.out.println(z + " is the maximum number");
			max = z;
		} else {
			System.out.println(y + " is the maximum number");
			max = y;
		}
		return max;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Test maximum Code");

		System.out.println("Enter three variables");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		findMaximum(a, b, c);
	}
}