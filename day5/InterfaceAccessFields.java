package com.bridgelabz.day5;

interface Myinterface{
	
	public static int num=100;
	public void display();
	
}
class InterfaceAccessFields implements Myinterface{
	
	public static int num=10000;
	 public void display() {
	      System.out.println("This is the implementation of the display method");
	   }
	   public void show() {
	      System.out.println("This is the implementation of the show method");
	   }
	   public static void main(String[] args) {
		   InterfaceAccessFields ia=new InterfaceAccessFields();
		   System.out.println("Value of num of the interface "+Myinterface.num);
		      System.out.println("Value of num of the class "+ia.num);
		      
				/*
				 * ia.num=20000;
				 * 
				 * System.out.println("Value of num of the class "+ia.num);
				 */
	}
}

