package com.zorbasoft.exam;

public class LoopPractice4 {
	public static void main(String[] args) {

		// Write a program to demostrate factorial program in java

		int i = 1;
		int fact = 1;
		int number = 5;// It is the number to calculate factorial
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

}
