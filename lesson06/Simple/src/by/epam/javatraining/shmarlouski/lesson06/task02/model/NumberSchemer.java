package by.epam.javatraining.shmarlouski.lesson06.task02.model;

import static by.epam.javatraining.shmarlouski.lesson06.task02.view.Printer.print;

public class NumberSchemer {

	public static boolean checkArising(int number) {
		if (number < 0) {
			print("Number must be positive");
			return false;
		}
		int currentDigit = 0;
		while (number > 0) {
			currentDigit = number % 10;
			number /= 10;
			if (currentDigit <= number % 10) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkDescending(int number) {
		if (number < 0) {
			print("Number must be positive");
			return false;
		}
		int currentDigit = 0;
		while (number > 10) {
			currentDigit = number % 10;
			number /= 10;
			if (currentDigit >= number % 10) {
				return false;
			}
		}
		return true;
	}
}
