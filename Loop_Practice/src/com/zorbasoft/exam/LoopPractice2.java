package com.zorbasoft.exam;

import java.util.Scanner;

public class LoopPractice2 {
	public static void main(String[] args) {

		// Write a program to check if a number is palindrome or not

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum = 0;
		int r = 0;
		int temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		if (temp == sum) {
			System.out.println("The number is palidrone");
		} else {
			System.out.println("The number is not palidrone");

		}

	}

}
