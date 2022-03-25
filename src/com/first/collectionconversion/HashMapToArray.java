package com.first.collectionconversion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapToArray {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(101, "Ramana");
		hm.put(102, "Veeresham");
		hm.put(103, "Suresh");
		hm.put(104, "Pavan");
		hm.put(105, "Vijay");
		
		for (Map.Entry<Integer, String> entry : hm.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());
		}
			
			  Set<Integer> keySet = hm.keySet();
			  
		        // Creating an ArrayList of keys
		        // by passing the keySet
		        ArrayList<Integer> listOfKeys
		            = new ArrayList<Integer>(keySet);
		  
		        // Getting Collection of values from HashMap
		        Collection<String> values = hm.values();
		  
		        
		        ArrayList<String> listOfValues
		            = new ArrayList<>(values);
		  
		        System.out.println("The Keys of the Map are "
		                           + listOfKeys);
		  
		        System.out.println("The Values of the Map are "
		                           + listOfValues);
			
	
	}
}

