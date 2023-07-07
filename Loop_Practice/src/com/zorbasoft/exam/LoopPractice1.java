package com.zorbasoft.exam;

import java.util.Scanner;

public class LoopPractice1 {
	public static void main(String[] args) {

		// Write a program to check a number is prime or not.

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		boolean isPrime = true;

		if (number <= 0) {
			isPrime = false;
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}

}
