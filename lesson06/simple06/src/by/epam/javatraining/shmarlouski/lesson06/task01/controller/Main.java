package by.epam.javatraining.shmarlouski.lesson06.task01.controller;

import static by.epam.javatraining.shmarlouski.lesson06.task01.model.RandomNumber.getRandomInt;
import static by.epam.javatraining.shmarlouski.lesson06.task01.model.HeadsOrTales.getResult;
import static by.epam.javatraining.shmarlouski.lesson06.task01.view.Printer.print;

public class Main {

	public static void main(String[] args) {

		int turn = getRandomInt(1000);
		String result = getResult(turn);

		print(result);
	}
}
