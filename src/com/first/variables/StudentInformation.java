package com.first.variables;

import java.util.Scanner;

public class StudentInformation {

	void m1(int x, String y, String z) {
		
		System.out.println(":Student Information is:");
		
		System.out.println("Student's Name is "+y);
		
		System.out.println("Student's Roll no. is "+x);
		
		System.out.println("Student's Grade is "+z);
	
		
}
	public static void main(String[] args) {
		
	
		StudentInformation obj = new StudentInformation();
		
		Scanner sc= new Scanner(System.in);
		
        System.out.println("Enter the Student name");
		
		String name = sc.next();
		
		System.out.println("Enter "+name+"'s Roll No.");
		
		int rno = sc.nextInt();
		
		System.out.println("Enter " +name+"'s grade");
		
		String grade = sc.next();
		
		obj.m1(rno, name, grade);
		
		sc.close();

		}

}
