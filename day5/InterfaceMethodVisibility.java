package com.bridgelabz.day5;

interface displayName{
	
	void displayMessage();
}
class Message implements displayName
{

	public void displayMessage() {
	System.out.println("Interface implemented method");
		
	}
	
}
public class InterfaceMethodVisibility {
public static void main(String[] args) {
	Message m=new Message();
	m.displayMessage();
}
}
