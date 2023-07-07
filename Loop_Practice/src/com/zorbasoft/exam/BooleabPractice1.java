package com.zorbasoft.exam;

public class BooleabPractice1 {
	public static void main(String[] args) {
		// I want to develop a method which will accept an array and the value in
		// parameter, then it will
		// tell me that particular value is present inside the array / how many times.

		String[] names = { "subhendu", "Rajesh", "viviek", "hari", "Ravi", "hari", "Ritesh", "hari" };
		String nameToCheck = "hari";
		int counter = checkValue(names, nameToCheck);

		System.out.println(nameToCheck + " appears " + counter + " times");

	}

	public static int checkValue(String[] arr, String value) {
		int count = 0;

		for (String name : arr) {
			if (name.equals(value)) {

				count++;
			}
		}

		return count;
	}
}
