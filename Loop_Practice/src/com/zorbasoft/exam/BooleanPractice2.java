package com.zorbasoft.exam;

public class BooleanPractice2 {
	public static void main(String[] args) {

		// I want to display the count of all the available values , how many times they
		// appeared in array

		String[] names = { "subhendu", "Rajesh", "viviek", "hari", "Ravi", "hari", "Ritesh", "hari" };
		boolean indicator = false;

		for (String nm : names) { // Subendhu
			int count = 0;
			for (String name : names) { // Subendhu
				if (name.equals(nm)) {
					count++;

				}
			}
			System.out.println(nm + " " + "is present for" + " " + count + " " + "times");
		}
	}

}
