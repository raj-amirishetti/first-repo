package com.first.variables;

public class LearningMethods {
	
	int a=50;
	String b="rajashekar";
	double c=100;
	
	public void add() { 
		
		double x=a+c;
		 
		System.out.println("addition of a and c is "+x);
		
		System.out.println("my name is "+b);
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		LearningMethods obj = new LearningMethods();
		obj.add();
	}
}