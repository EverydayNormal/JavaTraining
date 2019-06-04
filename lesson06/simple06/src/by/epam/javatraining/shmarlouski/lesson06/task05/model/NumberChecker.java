package by.epam.javatraining.shmarlouski.lesson06.task05.model;

public class NumberChecker {

	public static boolean isPrimeNumber(int number) {
		boolean answer = true;
		if (number < 0) {
			answer = false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				answer = false;
			}
		}
		return answer;
	}
}
