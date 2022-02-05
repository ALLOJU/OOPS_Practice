package com.bridgelabz.day5;
 class Animal {
	  final String name="German sheford";
	  final void characteristics() {
	    int legs = 4;
	    int ears = 2;
	    int eyes = 2;
	    int tail = 1;
	    System.out.println("General Characteristics of an Animal are: ");
	    
	    System.out.println("Dog name is: " + name);
	    System.out.println("Legs: " + legs);
	    System.out.println("Eyes: " + eyes);
	    System.out.println("Ears: " + ears);
	    System.out.println("Tail: " + tail);
	  }
}
	public class FinalExample extends Animal {
	  final void sound() {
	    System.out.println();
	    System.out.println("Additional Characteristics:");
	    System.out.println("Sound: Bhow Bhow");
	 
	    
	  }
	  public static void main(String[] args) {
		  FinalExample d = new FinalExample();
		    d.characteristics();
		    d.sound();
		  }
	  

}