package by.epam.javatraining.shmarlouski.lesson06.task04.controller;

import static by.epam.javatraining.shmarlouski.lesson06.task04.view.Printer.print;
import static by.epam.javatraining.shmarlouski.lesson06.task04.model.NumberSchemer.*;
import static by.epam.javatraining.shmarlouski.lesson06.task04.model.RandomNumber.getRandomInt;

public class Main {

	public static void main(String[] args) {

		int number = 1231;//getRandomInt(1000);

		boolean evenCheck = isEvenNumber(number);
		boolean oddCheck = isOddNumber(number);

		print("Even of digits in number " + number + " is " + evenCheck);
		print("Odd of digits in number " + number + " is " + oddCheck);
	}
}
