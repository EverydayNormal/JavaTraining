package by.epam.javatraining.shmarlouski.lesson06.task01.model;

import static by.epam.javatraining.shmarlouski.lesson06.task01.model.RandomNumber.getRandomInt;

public class HeadsOrTales {

	private static int headsCount = 0;
	private static int tailsCount = 0;

	public static String getResult(int turn) {
		if (turn < 0) {
			return "Number of throws must be positive";
		}

		for (int i = 0; i < turn; i++) {
			throwingUp();
		}
		return "Heads was dropped " + headsCount + " and tails was dropped " + tailsCount;
	}

	private static int throwingUp() {
		int throwing = getRandomInt(100);
		if (throwing % 2 == 0) {
			return headsCount++;
		}
		return tailsCount++;
	}
}
