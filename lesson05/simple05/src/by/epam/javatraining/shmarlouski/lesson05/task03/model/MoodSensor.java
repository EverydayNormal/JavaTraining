package by.epam.javatraining.shmarlouski.lesson05.task03.model;

public class MoodSensor {

	private static final String SAD = "(-_- )'";
	private static final String CASUAL = "('-' )";
	private static final String ACTIVE = "\\('o' )/";

	public static String findMood(int number) {
		String mood = ACTIVE;
		if ((number %= 10) <= 3) {
			mood = SAD;
		} else if (number <= 7) {
			mood = CASUAL;
		}
		return mood;
	}
}
