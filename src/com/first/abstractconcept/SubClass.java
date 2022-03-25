package com.first.abstractconcept;

public class SubClass extends AbstractLearning {

	void m2() {
		System.out.println("unimplemented method");
	}

	public static void main(String[] args) {
		AbstractLearning obj = new SubClass();
		obj.m1();
		obj.m2();
	}
}
