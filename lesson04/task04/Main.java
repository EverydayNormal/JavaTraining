package lesson04.task04;

import lesson04.task01.Printer;

public class Main {

	public static void main(String[] args) {
		double number = 152358;

		Finder.separateNumbers(number);

		double arithmeticalAverage = Finder.findArithmeticalAverage();
		double geometricAverage = Finder.findGeometricAverage();

		Printer.print("Arithmetical average of number " + number + " is " + arithmeticalAverage);
		Printer.print("Geometric average of number " + number + " is " + geometricAverage);
		
	}
}
