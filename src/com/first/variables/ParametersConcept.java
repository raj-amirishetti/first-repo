package com.first.variables;

public class ParametersConcept {

	void m1(int x, int y){
		
		int z = x*y;
		
		System.out.println("multiplication of x and y is "+z );
		
		}
	
	public static void main(String[] args) {
		
		ParametersConcept obj = new ParametersConcept();
		
		obj.m1(20,50);
		
		obj.m1(14, 25);
		
		obj.m1(25, 35);
	}

}
