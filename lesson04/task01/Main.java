package lesson04.task01;

import static lesson04.task01.Printer.print;

public class Main {

	public static void main(String[] args) {

		double a = 4.4d, b = 4.4d, c = 4.5d;

		boolean result = NumberComparator.compareNumbers(a, b, c);

		print("Equality of numbers is " + result);
	}
}
