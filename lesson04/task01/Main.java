package lesson04.task01;

public class Main {

	public static void main(String[] args) {

		double a = 4.4d; 
		double b = 4.4d;
		double c = 5.5d;

		boolean result = NumberComparator.compareNumbers(a, b, c);
		
		Printer.print("Equality of numbers is " + result);

		// second version
		 //NumberComparator.compareNumbersIndividually(a, b, c);
	}
}
