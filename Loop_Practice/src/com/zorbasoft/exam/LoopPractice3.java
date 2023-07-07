package com.zorbasoft.exam;

import java.util.Scanner;

public class LoopPractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the number:");
		int n = sc.nextInt();

		int r = 0;
		int sum = 0;
		int temp = n;

		while (n > 0) {

			r = n % 10;
			sum = sum + (r * r * r);

			n = n / 10;// n /= 10;
		}

		if (temp == sum) {
			System.out.println("Print the number is armstrong:");
		} else {
			System.out.println("The number is not armstrong :");
		}

	}

}
