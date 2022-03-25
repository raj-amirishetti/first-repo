package com.first.constructorsconcept;

public class A { 
	
		void add(int a , int b) {
		 
		
		 System.out.println("sum of a+b is "+ (a+b));
		 
		 }
	
	public A(int a, int b) {
		
		System.out.println(a+b);
	
	}
	
	public static void main(String[] args) {

		A obj = new A(10,15);
		A obj1= new A(25,55);
	    obj.add(5,25);
	    obj1.add(5,35);
		
	}

}
