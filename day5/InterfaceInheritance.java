package com.bridgelabz.day5;

interface Show{
	
	void print();
	
}
interface Display extends Show{
	
	void shows();
	
}
public class InterfaceInheritance implements Display {

	@Override
	public void print() {
	 System.out.println("Hello");
		
	}

	@Override
	public void shows() {
		 System.out.println("Welcome");
		
	}
	public static void main(String[] args) {
		InterfaceInheritance interf=new InterfaceInheritance();
		interf.print();
		interf.shows();
	}

}
