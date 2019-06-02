package by.epam.javatraining.shmarlouski.lesson06.task05.model;

public class NumberChecker {

	public static boolean isPrimeNumber(int number) {
		if (number < 0) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
