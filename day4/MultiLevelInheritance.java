package com.bridgelabz.day4;

class Animals{
	void eat() {
		
		System.out.println("Eating");
	}
}
class Dogs extends Animals{
	
	void bark() {
		
		System.out.println("Dog Barking");
	}
	
}
class BabyDogs extends Dogs{
	
	void weep() {
		
		System.out.println("Baby Dog weeping");
	}
	
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		BabyDogs bd=new BabyDogs();
		bd.weep();
		bd.eat();
		bd.bark();

	}
}
