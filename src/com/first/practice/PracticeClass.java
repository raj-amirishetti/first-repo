package com.first.practice;

public class PracticeClass {
	
	
	PracticeClass(){					//Class name and Constructor must be same
												//Declaration of Constructor
		System.out.println("Hi");
	}

	PracticeClass(int a){
		System.out.println(a);
	}
	
	PracticeClass(String a){
		
		System.out.println(a);
	}
	void m1() {
		System.out.println("m1 method");
	}

	void m2() {
		System.out.println("m2 method");
	}

	void m1(int a) {
		System.out.println("m1 method with single parameter " + a);
	}

	void m1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + " " + b);
		System.out.println("m1 method with two parameter " + (a + b));
	}

	void m1(String a) {

	}

	public static void main(String[] args) {

		PracticeClass obj = new PracticeClass();
		PracticeClass obj1 = new PracticeClass(5);
		PracticeClass obj2= new PracticeClass();

		obj.m1();
		obj.m2();
		obj.m1(143);
		obj.m1(7, 8);
		obj.m1();

	}
}
