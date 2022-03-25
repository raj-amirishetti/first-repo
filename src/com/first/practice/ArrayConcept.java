package com.first.practice;

public class ArrayConcept {

	public static void main(String[] args) {
		int[] a; // array declaring 
		a=new int[5];//array instantiating OR allocating memory to array
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5; //initializing the elements 
		
		int[] b=new int[6];//declaring and instantiating in a single line
		b[0]=10;
		b[1]=9;
		
		String[] c=new String[] {"Anil","raj", "kishore"};// array declaring,instantiating and initializing in single line
		
		System.out.println("Elements of array are ::::");
	for (int i = 0; i < a.length; i++) {// printing array elements using for loop

		System.out.println(a[i]);
		
	}		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		

	}

}
