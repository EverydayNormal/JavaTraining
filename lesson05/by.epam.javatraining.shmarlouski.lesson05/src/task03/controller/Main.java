package task03.controller;

import static task03.model.MoodSensor.getMood;
import static task03.model.RandomNumber.getRandomInt;
import static task03.view.Printer.print;


public class Main {

	public static void main(String[] args) {

		int realFeel = getRandomInt(10);

		String currentMood = getMood(realFeel);

		print(currentMood);
	}
}
