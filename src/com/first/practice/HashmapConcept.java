package com.first.practice;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class HashmapConcept {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Rakesh");
		map.put(2, "Kishore");
		map.put(3, "Anil");
		map.put(4, "Ranjith");
		map.put(5, "Sai");

		System.out.println("21 line " + map.get(2));
		System.out.println("22 line " + map.containsKey(3));
		System.out.println("23 line " + map.containsKey(6));

		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		HashMap<String, ArrayList<String>> test = new HashMap<>();

		ArrayList<String> al = new ArrayList<>();

		al.add("Raj");
		al.add("Ramesh");
		al.add("Rakesh");
		al.add("RAM");

		test.put("Names", al);
		System.out.println("39 line " + test.get("Names"));

		for (Map.Entry<String, ArrayList<String>> m : test.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
