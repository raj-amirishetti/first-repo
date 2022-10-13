package com.first.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachConcept {

	public static void main(String[] args) {
		
		
		
		String arr[] = new String[] { "Praveen", "raj", "shekar" };
		
		List<Integer> arrlist	= new ArrayList<Integer>();
		
		arrlist.add(55);
		arrlist.add(96);
		arrlist.add(45);
		arrlist.add(63);
		arrlist.add(78);
		
		System.out.println(arrlist);
		
		for (Integer i : arrlist) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

		for (String string : arr) {

			System.out.println(string);

		}

	}

}
