package lesson04.task02;

import static lesson04.task01.Printer.print;

public class Main {

	public static void main(String[] args) {

		double r1 = 12.3d;
		double r2 = 12.2d;

		double ringSquare = RoundLogic.findSquare(r1, r2);

		print("The ring's square is " + ringSquare);
	}
}
