package com.bridgelabz.day4;

public class StaticExample {

	static int a=10;
	static int n;
	static {
		System.out.println("Static Block iniatialized");
		n=a*10;
	       }
	public static void main(String[] args) {
		System.out.println("Inside main method");
		System.out.println("Value of a "+a);
		System.out.println("Value of a "+n);
	}
}
