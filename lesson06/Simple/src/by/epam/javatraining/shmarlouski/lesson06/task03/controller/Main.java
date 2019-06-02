package by.epam.javatraining.shmarlouski.lesson06.task03.controller;

import static by.epam.javatraining.shmarlouski.lesson06.task03.model.FactorialFinder.findFactorial;
import static by.epam.javatraining.shmarlouski.lesson06.task03.view.Printer.print;
import static by.epam.javatraining.shmarlouski.lesson06.task03.model.RandomNumber.getRandomInt;

public class Main {

	public static void main(String[] args) {

		int number = getRandomInt(100);

		int result = findFactorial(number);

		print("Factorial of number " + number + " is " + result);
	}
}
