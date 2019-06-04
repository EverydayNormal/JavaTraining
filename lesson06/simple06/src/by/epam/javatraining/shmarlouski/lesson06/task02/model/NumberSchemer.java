package by.epam.javatraining.shmarlouski.lesson06.task02.model;

public class NumberSchemer {
	
	private static boolean answer = true;
	private static int currentDigit = 0;

	public static boolean checkArising(int number) {
		answer = true;
		if (number < 0) {
			return false;
		}
		while (number > 0) {
			currentDigit = number % 10;
			number /= 10;
			if (currentDigit <= number % 10) {
				answer =  false;
			}
		}
		return answer;
	}

	public static boolean checkDescending(int number) {
		answer = true;		
		if (number < 0) {
			return false;
		}
		while (number > 10) {
			currentDigit = number % 10;
			number /= 10;
			if (currentDigit >= number % 10) {
				answer = false;
			}
		}
		return answer;
	}
}
