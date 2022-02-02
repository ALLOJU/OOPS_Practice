package com.bridgelabz.day4;

import java.util.Scanner;

class Animal{
	void eat() {
		
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	
	void bark() {
		
		System.out.println("Dog Barking");
	}
	
}



public class SingleInheritance {
	
public static void main(String[] args) {
	System.out.println("Enter type of Inheritance");
	Dog d1=new Dog();
	d1.bark();
	d1.eat();
}




}
