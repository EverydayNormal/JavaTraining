package task03;

import static task01.RandomNumber.getRandomInt;
import static task01.Printer.print;

public class Main {

	public static void main(String[] args) {

		int realFeel = getRandomInt(10);

		String currentMood = MoodSensor.getMood(realFeel);

		print(currentMood);
	}
}
