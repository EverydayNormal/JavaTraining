package by.epam.javatraining.shmarlouski.lesson06.task01.controller;

import static by.epam.javatraining.shmarlouski.lesson06.task01.model.RandomNumber.getRandomInt;
import static by.epam.javatraining.shmarlouski.lesson06.task01.model.HeadsOrTales.*;
import static by.epam.javatraining.shmarlouski.lesson06.task01.view.Printer.print;

public class Main {

	public static void main(String[] args) {

		int turn = getRandomInt(1000);
		String result = getResultAnotherWay(turn);
		String result2 = getResult(turn);

		print(result);
		print(result2);
	}
}
