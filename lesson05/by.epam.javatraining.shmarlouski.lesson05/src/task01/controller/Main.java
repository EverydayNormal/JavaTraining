package task01.controller;

import static task01.model.RandomNumber.getRandomInt;
import task01.model.DragonLogic;
import static task01.view.Printer.print;

public class Main {

	public static void main(String[] args) {

		int dragonYears = getRandomInt(1000);

		int heads = DragonLogic.getNumberOfHeads(dragonYears);
		int eyes = DragonLogic.getNumberOfEyes(heads);

		print("The dragon has " + heads + " heads and " + eyes + " eyes.");
	}
}
