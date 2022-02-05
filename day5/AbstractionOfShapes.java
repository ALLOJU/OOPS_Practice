package com.bridgelabz.day5;

abstract class Shape{
	abstract void area();
}
class Rectangle extends Shape{

	@Override
	void area() {
		
		System.out.println("Drawing Rectangle");
		
	}
	
}
class Circle extends Shape{

	@Override
	void area() {
		System.out.println("Drawing Circle");
	}
	
}
public class AbstractionOfShapes {

	Shape s=new Rectangle();
}
