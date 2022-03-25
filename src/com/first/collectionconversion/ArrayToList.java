package com.first.collectionconversion;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayToList {

	
	public static void main(String[] args) {
		String[] ar={"Raja", "shekar", "Mahesh", "Kishore", "Rakesh"};
			for (int i = 0; i < ar.length; i++) {
				
				System.out.println(ar[i]);
				
			}
			//List al = Arrays.asList(ar);
			ArrayList<String> al = new ArrayList<String>(Arrays.asList(ar));
		        System.out.println(al);
			System.out.println("Converted to arraylist "+al);
			
		
			al.add("raj");
			al.add("ramesh");
			al.add("rana");
			System.out.println("Adding three more elements "+al);
			
			
			
		}
	}

