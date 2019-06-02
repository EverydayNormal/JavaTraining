package by.epam.javatraining.shmarlouski.lesson06.task05.controller;

import static by.epam.javatraining.shmarlouski.lesson06.task05.view.Printer.print;
import static by.epam.javatraining.shmarlouski.lesson06.task05.model.RandomNumber.getRandomInt;
import static by.epam.javatraining.shmarlouski.lesson06.task05.model.NumberChecker.isPrimeNumber;

public class Main {

	public static void main(String[] args) {

		int number = getRandomInt(100);
		boolean result = isPrimeNumber(number);

		print(" Primary of number " + number + " is " + result);
	}
}
