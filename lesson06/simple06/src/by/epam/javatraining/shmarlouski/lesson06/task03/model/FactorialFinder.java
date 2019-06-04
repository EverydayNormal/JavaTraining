package by.epam.javatraining.shmarlouski.lesson06.task03.model;

public class FactorialFinder {

	public static int findFactorial(int number) {
		int factorial = 1;
		if (number == 0 || number == 1) {
			return factorial;
		}
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
