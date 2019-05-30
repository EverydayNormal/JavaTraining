package lesson03.Task02;

import static lesson03.task01.Printer.print;

public class NumberReplace {

	public static void main(String[] args) {

		double a = 12.23d;
		double b = 23.34d;

		a = a + b;
		b = a - b;
		a = a - b;

		print("At first number \"a\" was " + a + " and now it's " + b);
		print("At first number \"b\" was " + b + " and now it's " + a);
	}
}
