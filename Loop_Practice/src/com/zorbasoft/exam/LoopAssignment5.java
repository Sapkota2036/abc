package com.zorbasoft.exam;

public class LoopAssignment5 {
	public static void main(String[] args) {

		// 5. Write a program to copy one array to another array but in reverse order

		int[] arr = { 24, 83, 33, 50, 85 };
		System.out.println(" The orginial array : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");

		}
		System.out.println("The reverse array :");
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i] + " ");
		}
	}

}
