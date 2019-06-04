package by.epam.javatraining.shmarlouski.lesson05.task03.model;

import java.util.Random;

public class RandomNumber {
	
	private static Random random = new Random();
	
	public static int getRandomInt(int limit) {
		return random.nextInt(limit);
	}
}
