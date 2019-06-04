package by.epam.javatraining.shmarlouski.lesson06.task04.model;

public class NumberSchemer {

	private static int currentDigit = 0;
	private static boolean answer = true;

	public static boolean isEvenNumber(int number) {
		if (number <= 0) {
			return false;
		}
		answer = true;
		while (number > 0) {
			currentDigit = number % 10;
			number /= 10;
			if (currentDigit % 2 != 0) {
				answer = false;
			}
		}
		return answer;
	}

	public static boolean isOddNumber(int number) {
		if (number <= 0) {
			return false;
		}
		answer = true;
		while (number > 10) {
			currentDigit = number % 10;
			number /= 10;
			if (currentDigit % 2 == 0) {
				answer = false;
			}
		}
		return answer;
	}
}
