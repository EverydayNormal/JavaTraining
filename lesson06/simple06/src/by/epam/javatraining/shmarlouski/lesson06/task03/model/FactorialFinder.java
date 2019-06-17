package by.epam.javatraining.shmarlouski.lesson06.task03.model;

public class FactorialFinder {

	public static int findFactorial(int number) {

		int factorial = 1;

		for (int i = 2; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
