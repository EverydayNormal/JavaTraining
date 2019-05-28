package lesson04.task02;

import lesson04.task01.Printer;

public class Main {

	public static void main(String[] args) {

		double r1 = 22.3d;
		double r2 = 12.2d;

		double rs = RoundLogic.findSquare(r1, r2);
		
		Printer.print("The ring's square is " + rs);

	}
}
