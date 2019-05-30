package lesson04.task03;

import static lesson04.task01.Printer.print;

public class Main {

	public static void main(String[] args) {

		int number = 4321;

		NumberSchemer.separateDigits(number);

		boolean arisingCheck = NumberSchemer.checkArising();
		boolean descendingCheck = NumberSchemer.checkDescending();

		print("Arising of digits in number " + number + " is " + arisingCheck);
		print("Descending of digits in number " + number + " is " + descendingCheck);
	}
}
