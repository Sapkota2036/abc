package com.zorbasoft.exam;

import java.util.Scanner;

public class LoopAssignment2 {
	public static void main(String[] args) {

		// 2. Write a program to verify the odd and even numbers from a given array.

		int[] arr = { 14, 25, 39, 48, 74, 95 };

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();

		boolean flag = false;
		for (int numbers : arr) {
			if (numbers % 2 == 0 && numbers == num) {
				flag = true;

			}
		}

		if (flag == true) {
			System.out.println("number is even:");
		} else {
			System.out.println("number is odd:");
		}
	}

}
