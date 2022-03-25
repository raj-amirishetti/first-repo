package com.first.string;

public class StringBuilderConcept {

	public static void main(String[] args) {

		String name = "I am going to movie";

		String[] name1 = name.split(" "); //splitting string using split method
		
		for (String string : name1) {
			System.out.println(string);
		}

		/*for (int i = 0; i < name1.length; i++) {
			System.out.println(name1[i]);
		}*/

		StringBuilder str = new StringBuilder("I am learning Core Java ");

		str.append("and Adv Java ");// adding another string to stringbuilder

		str.append("to finally learn AEM");

		System.out.println(str);

		String[] str1 = str.toString().split("\\s");//converting to string from stringbuilder and applying split method
		
			for (String string : str1) {
				System.out.println(string);
			}
		/*for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);

		}*/

	}
}
