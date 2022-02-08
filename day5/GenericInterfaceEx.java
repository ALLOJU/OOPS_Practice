package com.bridgelabz.day5;

@FunctionalInterface
interface I<T>{
	public abstract T m1(T x);

}
public class GenericInterfaceEx {
	public static void main(String[] args) {
		I<Integer> obj1= (Integer x) -> {

			System.out.println("Lambda Integer:"+x);
			return 111;
		};
		System.out.println(obj1.m1(222));
		I<String> obj2=(x) -> {

			System.out.println("Lambda String :"+x);
			return "java8";
		};
		System.out.println(obj2.m1("java7"));
	}
}
