package com.first.practice;

public class ConstructorsLearning {

	public ConstructorsLearning() {
		
		System.out.println("default ");
	}
	
	public ConstructorsLearning(int a){
		
		System.out.println(a);
	}
	
	public ConstructorsLearning(String gender){
		
		System.out.println(gender);
	}
	
	public ConstructorsLearning(int a , int b)
	{
		System.out.println("two params "+a+ " "+b);
	}
	
	public ConstructorsLearning(int a , int b, int c) {
		
		System.out.println("three params ");
	}
	void dance() {
		
		System.out.println("knows dancing");
	}
	

	void sing() {
		System.out.println("knows singing");
	}
	
	public static void main(String[] args) {
		
		ConstructorsLearning anil=new ConstructorsLearning("male");
		ConstructorsLearning manju= new ConstructorsLearning("female");
		ConstructorsLearning obj= new ConstructorsLearning(45,55);
		ConstructorsLearning obj1= new ConstructorsLearning(45,55,55);
		ConstructorsLearning raj= new ConstructorsLearning(45,55,55);
		ConstructorsLearning obj2= new ConstructorsLearning();
		manju.dance();
		anil.sing();
		
	}
	
	
	
	

}
