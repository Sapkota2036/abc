package com.zorbasoft.exam;

import java.util.Scanner;

public class LoopAssignment1 {
	public static void main(String[] args) {
		
		//1. Write a program to check if a particular number is available inside an integer array

		int[]arr = {4,15,27,38,57,62};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		boolean flag = false;
		for(int numbers:arr) {
		if(numbers==num) {
			flag = true;
			break;
		}
		}
		if(flag == true) {
			System.out.println("The number is available:");
		}else {
			System.out.println("The number is not available:");
		}
		
	}
}
