package task03;

public class NumberSchemer {

	private static int firstNumber = 0;
	private static int secondNumber = 0;
	private static int thirdNumber = 0;
	private static int fourthNumber = 0;

	public static void separateDigits(int number) {
		firstNumber = number / 1000 % 10;
		secondNumber = number / 100 % 10;
		thirdNumber = number / 10 % 10;
		fourthNumber = number % 10;
		System.out.println(firstNumber + " " + fourthNumber);
	}

	public static boolean checkArising() {
		return firstNumber < secondNumber && secondNumber < thirdNumber && thirdNumber < fourthNumber;
	}

	public static boolean checkDescending() {
		return firstNumber > secondNumber && secondNumber > thirdNumber && thirdNumber > fourthNumber;
	}
}
