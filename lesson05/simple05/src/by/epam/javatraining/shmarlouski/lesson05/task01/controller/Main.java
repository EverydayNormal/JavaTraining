package by.epam.javatraining.shmarlouski.lesson05.task01.controller;

import static by.epam.javatraining.shmarlouski.lesson05.task01.model.RandomNumber.getRandomInt;
import by.epam.javatraining.shmarlouski.lesson05.task01.model.DragonLogic;
import static by.epam.javatraining.shmarlouski.lesson05.task01.view.Printer.print;

public class Main {

	public static void main(String[] args) {

		int dragonYears = getRandomInt(100);

		int heads = DragonLogic.getNumberOfHeads(dragonYears);
		int eyes = DragonLogic.getNumberOfEyes(dragonYears);

		print("The dragon has " + heads + " heads and " + eyes + " eyes.");
	}
}
