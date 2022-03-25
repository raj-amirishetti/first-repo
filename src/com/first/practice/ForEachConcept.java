package com.first.practice;

public class ForEachConcept {
	
	
	

	
	public static void main(String[] args) {
		String arr[]=new String[] {"Praveen","raj","shekar"};
		
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
		for (String string : arr) {
			
			System.out.println(string);
			
		}
		
	}
	
	
	
}
