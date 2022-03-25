package com.first.practice;

import java.util.Scanner;

public class ScannerLearning {
	
	
	void add(int x, int y) {
		
		System.out.println("Addition of your numbers is "+(x+y));
	}
	
	
	
	public static void main(String[] args) {
		
		ScannerLearning obj= new ScannerLearning();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Learning Scanner Concept");
		
		System.out.println("Enter your number for a ");
		
		int a= sc.nextInt();
		
		System.out.println("Enter your number for b");
		
		int b= sc.nextInt();
		
		obj.add(a, b);
		
		sc.close();
		
		
	}

}
