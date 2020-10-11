package com.blz.FindMaximum;

import java.util.Scanner;

public class UserMaximum {

	public static Scanner sc = new Scanner(System.in);
	
	public static String findMaximum(String x, String y, String z) {
		String max=x;
		if(x.compareTo(y)>0 && x.compareTo(z)>0) {
			max=x;
			System.out.println(x+" is the maximum String");
		}else if(z.compareTo(y)>0 && z.compareTo(x)>0) {
			System.out.println(z+" is the maximum String");
			max=z;
		} else {
			System.out.println(y+" is the maximum String");
			max=y;
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Welcome to Test maximum Code");
        
        System.out.println("Enter three Strings");
        String a=sc.next();
        String b=sc.next();
        String c=sc.next();
        System.out.println("Maximum string is "+findMaximum(a,b,c));
	}
}
