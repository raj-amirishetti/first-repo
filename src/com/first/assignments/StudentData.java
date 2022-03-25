package com.first.assignments;

public class StudentData {

	void m1(int a, String b, char c) {
		
		/*System.out.println("Student's name is "+b);
		System.out.println(b+"'s Roll no is "+a);
		System.out.println(b+"'s grade is "+c);
		System.out.println(b+" roll no. is "+a+" and grade is "+c);*/
		
		System.out.println(a+"      "+b+"     "+c);
	
	}
	public static void main(String[] args) {
		
		StudentData obj = new StudentData();
		
		System.out.println("::Students Information::");
		System.out.println("RollNo.   Name    Grade");
		
		obj.m1(101, "Raja", 'B');
		obj.m1(102, "Anil", 'C');
		obj.m1(103, "Arun", 'A');
		obj.m1(104, "Pavan", 'B');
		obj.m1(402, "Laxmi", 'A');	
	}

}
