package lesson04.task04;

public class Finder {

	private static double firstNumber = 0;
	private static double secondNumber = 0;
	private static double thirdNumber = 0;
	private static double fourthNumber = 0;
	private static double fifthNumber = 0;
	private static double sixthNumber = 0;

	public static void separateNumbers(double number) {
		sixthNumber = number % 10;
		number /= 10;
		fifthNumber = number % 10;
		number /= 10;
		fourthNumber = number % 10;
		number /= 10;
		thirdNumber = number % 10;
		number /= 10;
		secondNumber = number % 10;
		number /= 10;
		firstNumber = number % 10;
	}

	public static double findArithmeticalAverage() {
		return (firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber) / 6;
	}

	public static double findGeometricAverage() {
		return Math.pow(firstNumber, 1.0 / 6) * Math.pow(secondNumber, 1.0 / 6) * Math.pow(thirdNumber, 1.0 / 6)
				* Math.pow(fourthNumber, 1.0 / 6) * Math.pow(fifthNumber, 1.0 / 6) * Math.pow(sixthNumber, 1.0 / 6);
	}
}
