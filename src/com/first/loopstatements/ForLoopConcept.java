package com.first.loopstatements;

public class ForLoopConcept {

	static int[] std = new int[] { 1, 2, 3, 4, 5 };

	void arr(int[] args) {
		int sum = 0;
		System.out.println("The elements of array");

		for (int i = 0; i < args.length; i++) {

			
			System.out.println(std[i]);

		}

		for (int i = 0; i < args.length; i++) {
			sum = sum + std[i];

		}
		System.out.println("The sum of elements in given array " + sum);
	}

	public static void main(String[] args) {

		ForLoopConcept obj = new ForLoopConcept();
				obj.arr(std);

	}

}
