package com.magenic.java.masters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String args[]) {

		Scanner reader = new Scanner(System.in);
		int userInput = -1;
		boolean isValidInput = true;

		System.out.print("Enter a number [1-9]: ");

		try {
			userInput = reader.nextInt();
			if (userInput < 1 || userInput > 9) {
				isValidInput = false;
			}
		} catch (InputMismatchException ex) {
			isValidInput = false;
		}

		if (isValidInput) {
			System.out.println("You entered a valid number: " + userInput);
			NumberPrinter numPrinter = new NumberPrinter();
			numPrinter.printNumber(userInput);

		} else {
			System.out.println("You entered an invalid number!");
		}
		
		reader.close();
	}
}
