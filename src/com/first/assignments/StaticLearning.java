package com.first.assignments;

public class StaticLearning {


	
	static void m1(String a) {
		
		System.out.println("Hey "+a);//static method
	}
	
	void m2(int x, int y) {
		System.out.println("multipication of two numbers you entered is" + x*y);
	}
	public static void main(String[] args) {
		
		m1("raj"); //no need of object creation while calling static method //we can call it by class name also
		StaticLearning.m1("anil");
		StaticLearning obj= new StaticLearning(); //object creating is must while calling instance method
		obj.m2(5, 6);
		
	}

}
