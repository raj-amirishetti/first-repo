package com.first.variables;

import java.util.Scanner;

public class ScannerConcept {
	
	void m1(int Age)
	
	{
		System.out.println("You are "+Age+ " years old");
	}
	
	public static void main(String[] args) {
		
		ScannerConcept obj = new ScannerConcept();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int Age = sc.nextInt();
		
		obj.m1(Age);
		
		sc.close();
	}

}
