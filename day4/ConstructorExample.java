package com.bridgelabz.day4;

public class ConstructorExample {


	//creating a default constructor  
	ConstructorExample()
	{
		System.out.println("Bike is created");
	}  
	ConstructorExample(String name)
	{
		System.out.println("Bike Name is "+name);
	}  
	
	
	//main method  
	public static void main(String args[]){  
		//calling a default constructor  
		ConstructorExample b=new ConstructorExample();  
		ConstructorExample b1=new ConstructorExample(" Royal Enfield");
	}  


}