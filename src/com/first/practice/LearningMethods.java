package com.first.practice;

public class LearningMethods {
	
	void m1() { 
		
			System.out.println("m1 method is called");
		
	}

	void m2() {
		
		System.out.println("m2 method is called");

		
	}
	
	static void m3() {
		
		System.out.println("m3 static method is called");
		
	}
	
	public static void main(String[] args) {

		LearningMethods anil= new LearningMethods();	
		
	     anil.m1();
	     anil.m2();
		 m3();
		
		}

}
