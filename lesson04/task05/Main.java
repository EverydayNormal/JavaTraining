package lesson04.task05;

import static lesson04.task01.Printer.print;

public class Main {

	public static void main(String[] args) {

		int number = 4214231;

		NumberSchemer.separateNumbers(number);
		int reverseNumber = NumberSchemer.reverseDigits();

		print("Reversed version of number " + number + " will be " + reverseNumber);
	}
}
