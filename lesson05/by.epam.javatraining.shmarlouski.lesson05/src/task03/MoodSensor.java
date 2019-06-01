package task03;

public class MoodSensor {

	public static String getMood(int number) {

		if ((number %= 10) <= 3) {
			return "(-_- )'";
		} else if (number <= 7) {
			return "('-' )";
		} else {
			return "\\('o' )/";
		}
	}
}
