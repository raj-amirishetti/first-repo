package com.first.assignments;

import java.util.Scanner;

public class EmployeeSalary {

	void depositSalary(int sal) {
		try {
			if (sal < 0) {
				throw new EmpNegSalException("You can't enter the salary in Negative");
			} else {
				System.out.println("You entered the employee's salary is " + sal);
			}
		} catch (EmpNegSalException e) {
			// System.out.println(e.getMessage());      //To print just user's message
			e.printStackTrace();                       // To print details of exception along with user's message

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeSalary obj = new EmployeeSalary();
		System.out.println("Enter the Employee's salary");
		int sal = sc.nextInt();
		obj.depositSalary(sal);
	}

}
