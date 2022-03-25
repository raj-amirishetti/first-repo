package com.first.variables;

import java.util.Scanner;

public class LearningScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value");
		int x = sc.nextInt();
		System.out.println("Enter y value");
		int y = sc.nextInt();
		int z = x*y;
		System.out.println("multiplication of x and y is "+z);
		sc.close();
    }

}
