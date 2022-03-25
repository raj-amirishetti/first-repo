package com.first.assignments;

import java.util.Scanner;

public class Library {

	private String bookName;
	private String authorName;
	private int rackNum;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getRackNum() {
		return rackNum;
	}

	public void setRackNum(int rackNum) {
		this.rackNum = rackNum;
	}

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

	private int pubYear;

	public Library(String a, String b, int p, int q) {
		this.bookName = a;
		this.authorName = b;
		this.rackNum = p;
		this.pubYear = q;
	}

	void display() {

		System.out.println("BOOK NAME IS " + bookName);
		System.out.println("BOOK'S AUTHOR IS " + authorName);
		System.out.println("PUBLISHED YEAR IS " + pubYear);
		System.out.println("THE BOOK IS AVAILABLE IN RACK NUMBER " + rackNum);
	}

	/*
	 * @Override public String toString() { return "Library [bookName=" + bookName +
	 * ", authorName=" + authorName + ", rackNum=" + rackNum + ", pubYear=" +
	 * pubYear + "]"; }
	 */

	public static void main(String[] args) {
		Library books[] = new Library[3];
		Library book1 = new Library("A", "X", 1, 1990);
		Library book2 = new Library("B", "Y", 2, 1995);
		Library book3 = new Library("C", "Z", 4, 2000);
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;

		Scanner sc = new Scanner(System.in);

		// System.out.println(books[0].getBookName());

		// System.out.println(books[0].toString());

		System.out.println("Enter your book name");

		String x = sc.nextLine();

		for (int i = 0; i < books.length; i++) {

			if (x.equalsIgnoreCase(books[i].getBookName())) {

				books[i].display();

			} else {
				System.out.println("The book you wanted is not available.");

			}
		}
	}
}