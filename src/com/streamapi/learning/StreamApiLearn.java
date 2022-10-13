package com.streamapi.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiLearn {

	public static void main(String[] args) {

		// one of the ways to declare arraylist which mutable

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(11);
		list1.add(25);
		list1.add(23);
		list1.add(44);
		list1.add(16);
		list1.add(8);
		list1.add(7);

		System.out.println(list1);

		// another way to declare arraylist which is immutable

		List<Integer> list2 = Arrays.asList(2, 5, 9, 14, 75, 62);

		System.out.println(list2);

		// finding even numbers from list1 and adding to listEven
		List<Integer> listEven = new ArrayList<Integer>();

		for (Integer i : list1) {
			if (i % 2 == 0) {

				listEven.add(i);
			}
		}
		System.out.println(listEven);

		// using streams
		Stream<Integer> stream = list1.stream();

		List<Integer> listEven1 = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println(listEven1); 

		List<Integer> listOdd = list2.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());

		System.out.println(listOdd);
		
		

	}

}
