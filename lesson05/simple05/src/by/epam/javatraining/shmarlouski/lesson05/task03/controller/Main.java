package by.epam.javatraining.shmarlouski.lesson05.task03.controller;

import static by.epam.javatraining.shmarlouski.lesson05.task03.model.MoodSensor.findMood;
import static by.epam.javatraining.shmarlouski.lesson05.task03.model.RandomNumber.getRandomInt;
import static by.epam.javatraining.shmarlouski.lesson05.task03.view.Printer.print;

public class Main {

	public static void main(String[] args) {

		int realFeel = getRandomInt(10);

		String currentMood = findMood(realFeel);

		print(currentMood);
	}
}
