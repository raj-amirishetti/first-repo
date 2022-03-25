package com.first.loopstatements;

public class ArrayAscending {

	static int[] arr = new int[] {1 ,5, 4, 2,0 };

	static void ascend() {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				
				}
			}
			for (int k= 0; k < arr.length; k++) {
				
				System.out.println(arr[k]);
				
			}
		}

	}

	public static void main(String[] args) {
		
		System.out.println("ascending order of array");
		ascend();
		
	}
}
