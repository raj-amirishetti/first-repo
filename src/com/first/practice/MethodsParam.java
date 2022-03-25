package com.first.practice;

public class MethodsParam {

	void m1() {

		System.out.println("M1 method is called");

	}

	void m1(int x) {

		System.out.println("the number you entered in m1 method is " + x);

	}

	void m1(int x, int y) {

//		int add= x+y;

		System.out.println("addition of two numbers is " + (x + y));

	}

	void m1(String y, double x) {

		System.out.println(y + "'s height is " + x);

	}

	public static void main(String[] args) {

		MethodsParam obj = new MethodsParam();

		System.out.println("Learning method overloading");

		obj.m1();
		obj.m1(8055);
		obj.m1(143);
		obj.m1(5, 7);
		obj.m1(3, 2);
		obj.m1("Anil", 165.65);

	}

}
