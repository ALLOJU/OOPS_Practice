package com.bridgelabz.day5;

interface Printable{
	
	void print();
}

interface Showable{
	
	void print();
}
public class MultipleInheritance implements Printable,Showable {

	@Override
	public void print() {
		System.out.println("hello bridgelabz");
		
	}
	public static void main(String[] args) {
		MultipleInheritance mi=new MultipleInheritance();
		mi.print();
	}
	
}
