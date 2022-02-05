package com.bridgelabz.day5;

interface Engine{
	
	void changeGear(int a);
	void speed(int s);
}
class Vehicle implements Engine{

	@Override
	public void changeGear(int a) {
	
		System.out.println("Gear number is "+a);
		
	}

	@Override
	public void speed(int s) {
		System.out.println("Speed of  Vehicle is "+s);
		
	}
	
}
public class VehiclesEngineInterface {
public static void main(String[] args) {
	Vehicle vh=new Vehicle();
	vh.changeGear(3);
	vh.speed(300);
}
}
