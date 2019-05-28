package lesson04.task03;

public class NumberSchemer {

	private static int firstNumber = 0;
	private static int secondNumber = 0;
	private static int thirdNumber = 0;
	private static int fourthNumber = 0;

	public static void separateDigits(int number) {
		fourthNumber = number % 10;
		number /= 10;
		thirdNumber = number % 10;
		number /= 10;
		secondNumber = number % 10;
		number /= 10;
		firstNumber = number % 10;
	}

	public static boolean checkArising() {
		return firstNumber < secondNumber && secondNumber < thirdNumber && thirdNumber < fourthNumber;
	}

	public static boolean checkDescending() {
		return firstNumber > secondNumber && secondNumber > thirdNumber && thirdNumber > fourthNumber;
	}
}
