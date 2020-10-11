package com.blz.FindMaximum;

import java.util.Arrays;
import java.util.Scanner;

public class UserMaximum <E extends Comparable<E>> {

	E x,y,z;
	E max;
	public static Scanner sc = new Scanner(System.in);
    
	public UserMaximum() {
		
	}
	
	public E printMax(){
		return this.max;
	}
	
	public E findMaximum(E ...values) {
		Arrays.sort(values);
		this.max=values[values.length-1];
		return max;
	}

	public static void main(String[] args) {
	
		System.out.println("Welcome to Test maximum Code");
	}
}