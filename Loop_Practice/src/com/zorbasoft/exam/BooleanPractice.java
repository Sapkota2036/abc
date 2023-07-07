package com.zorbasoft.exam;

import java.util.Scanner;

public class BooleanPractice {
	public static void main(String[] args) {

		// can you check if any specific String// hari is availabel inside the Array or
		// not?
		// can you calculate how many time the name "hari" appeared in the array
		// user can search for any name , how many times it has appeared to array
		// I want to display the count of all the available values , how many times they
		// appeared in array

		String[] names = { "subhendu", "Rajesh", "viviek", "hari", "Ravi", "hari", "Ritesh", "hari" };
		boolean indicator = false;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please write the name");
		String nm = sc.next();
		int count = 0;
		for (String name : names) {

			if (name.equals("subendhu")) {
				indicator = true;
				count++;

			}
		}

		if (indicator == true) {
			System.out.println("Name is present for " + " " + count + " times");
		} else {
			System.out.println("name is not present");
		}

	}
}
