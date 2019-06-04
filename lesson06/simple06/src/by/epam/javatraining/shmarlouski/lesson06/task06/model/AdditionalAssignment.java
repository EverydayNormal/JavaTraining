package by.epam.javatraining.shmarlouski.lesson06.task06.model;

public class AdditionalAssignment {

	public static int getNumberOfEvenDigits(int number) {
		int count = 0;
		while (number > 0) {
			if ((number % 10) % 2 == 0) {
				count++;
			}
			number /= 10;
		}
		return count;
	}

	public static int getSumOfDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public static double findArithmeticAverage(int number) {
		double digitCount = 0;
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
			digitCount++;
		}
		return sum / digitCount;
	}

	public static boolean isPalindrome(int number) {
		int reversedNumber = 0;
		int originalNumber = number;
		while (number > 0) {
			reversedNumber += number % 10;
			if (reversedNumber == originalNumber) {
				return true;
			}
			number /= 10;
			reversedNumber *= 10;
		}
		return false;
	}

	public static boolean isDigitsAreSame(int number) {
		int currentDigit = number % 10;
		while (number > 0) {
			if (currentDigit != number % 10) {
				return false;
			}
			number /= 10;
		}
		return true;
	}

	public static int findMaxDigit(int number) {
		int max = number % 10;
		while (number > 0) {
			number /= 10;
			if (max < number % 10) {
				max = number % 10;
			}
		}
		return max;
	}

	public static boolean isPerfectNumber(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			return true;
		}
		return false;
	}
}
