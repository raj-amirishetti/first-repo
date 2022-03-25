package com.first.exceptions;

public class ExceptionsConcept {

	void div() {

		try {
			int a = 20, b = 0;
			int c = a / b;
			System.out.println("result " + c);

		} catch (ArithmeticException e) {

			System.out.println("arithmetic exception "+e);//

		} finally {
			System.out.println("exception is handled");
		}
	}

	public static void main(String[] args) {
		ExceptionsConcept obj = new ExceptionsConcept();
		obj.div();

	}
}
