package com.blz.FindMaximum;
import java.util.Scanner;

public class UserMaximum {

	public static Scanner sc = new Scanner(System.in);


	public static <E extends Comparable<E>> E findMaximum(E x, E y, E z) {
		E max = x;
		if (x.compareTo(y) > 0 && x.compareTo(z) > 0) {
			max = x;
			System.out.println(x + " is the maximum ");
		} else if (z.compareTo(y) > 0 && z.compareTo(x) > 0) {
			System.out.println(z + " is the maximum ");
			max = z;
		} else {
			System.out.println(y + " is the maximum ");
			max = y;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Test maximum Code");

		System.out.println("Enter three integer variables");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Maximum number is " + findMaximum(a, b, c));

		System.out.println("Enter three float variables");
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		float z = sc.nextFloat();
		System.out.println("Maximum number is " + findMaximum(x, y, z));

		System.out.println("Enter three Strings");
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		System.out.println("Maximum string is " + findMaximum(str1, str2, str3));
	}
}
