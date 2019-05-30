package lesson04.task04;

import static lesson04.task01.Printer.print;

public class Main {

	public static void main(String[] args) {

		double number = 152358;

		Finder.separateNumbers(number);

		double arithmeticalAverage = Finder.findArithmeticalAverage();
		double geometricAverage = Finder.findGeometricAverage();

		print("Arithmetical average of number " + number + " is " + arithmeticalAverage);
		print("Geometric average of number " + number + " is " + geometricAverage);

	}
}
