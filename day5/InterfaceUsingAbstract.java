package com.bridgelabz.day5;

interface Absinterf
{
	void learnCoding();
    void learnProgrammingLanguage();
    void practiceCoding();
}
abstract class Student implements Absinterf{
	
	 public void learnCoding()
	    {
	        System.out.println(
	            "Let's make coding a habit ");
	    }
	    @Override public void learnProgrammingLanguage()
	    {
	        System.out.println("Let's master all fundamentals of java");
	    }
}
class programmer extends Student {
    
  
	@Override
	public void practiceCoding() {
		
		System.out.println("Practice Coding");
	}
}
public class InterfaceUsingAbstract {
public static void main(String[] args) {
	programmer pg=new programmer();
	pg.learnCoding();
	pg.learnProgrammingLanguage();
	pg.practiceCoding();
	
}
}
