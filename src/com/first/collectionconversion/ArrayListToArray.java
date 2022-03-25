package com.first.collectionconversion;

import java.util.ArrayList;

public class ArrayListToArray {
	
	

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();

		al.add("Raj");
		al.add("Ramesh");
		al.add("Mohan");
		al.add("Sunny");
		al.add("Rakesh");
		
		Object[] ar = al.toArray();
		
		for (Object obj : ar) {
			System.out.println(obj);
			
		}
		
		 
		
		
	}

}
