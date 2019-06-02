package by.epam.javatraining.shmarlouski.lesson06.task04.model;

public class NumberSchemer {

	public static boolean isEvenNumber(int number) {
		if (number <= 0) {
			return false;
		}

		int currentDigit = 0;
		while (number > 0) {
			currentDigit = number % 10;
			number /= 10;
			if (currentDigit % 2 != 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isOddNumber(int number) {
		if (number <= 0) {
			return false;
		}
		int currentDigit = 0;
		while (number > 10) {
			currentDigit = number % 10;
			number /= 10;
			if (currentDigit % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}
