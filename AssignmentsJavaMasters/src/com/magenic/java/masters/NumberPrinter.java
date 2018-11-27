package com.magenic.java.masters;

public class NumberPrinter {

	/***
	 * Prints numbers from 1 to userInput in a single row
	 * 
	 * @param userInput
	 */
	void printNumberRow(int userInput) {
		if (userInput <= 0) {
			return;
		}

		printNumberRow(userInput - 1);
		System.out.print(userInput);

	}

	/***
	 * Prints numbers recursively
	 * 
	 * @param userInput
	 */
	void printNumber(int userInput) {
		if (userInput <= 0) {
			return;
		}

		printNumber(userInput - 1);
		System.out.println();
		printNumberRow(userInput);
	}
}
