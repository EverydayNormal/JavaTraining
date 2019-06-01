package task01;

import static task01.RandomNumber.getRandomInt;

public class Main {

	public static void main(String[] args) {

		int dragonYears = getRandomInt(1000);

		int heads = DragonLogic.getNumberOfHeads(dragonYears);
		int eyes = DragonLogic.getNumberOfEyes(heads);

		Printer.print("The dragon has " + heads + " heads and " + eyes + " eyes.");
	}
}
