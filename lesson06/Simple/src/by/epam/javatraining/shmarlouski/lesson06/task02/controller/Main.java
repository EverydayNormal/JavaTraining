package by.epam.javatraining.shmarlouski.lesson06.task02.controller;

import static by.epam.javatraining.shmarlouski.lesson06.task02.view.Printer.print;
import static by.epam.javatraining.shmarlouski.lesson06.task02.model.NumberSchemer.*;
import static by.epam.javatraining.shmarlouski.lesson06.task02.model.RandomNumber.getRandomInt;

public class Main {

	public static void main(String[] args) {

		int number = getRandomInt(10000);

		boolean arisingCheck = checkArising(number);
		boolean descendingCheck = checkDescending(number);

		print("Arising of digits in number " + number + " is " + arisingCheck);
		print("Descending of digits in number " + number + " is " + descendingCheck);
	}
}
