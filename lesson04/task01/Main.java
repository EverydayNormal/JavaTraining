package task01;

public class Main {

	public static void main(String[] args) {

		double a = 3.3d, b = 4.4d, c = 5.5d;

		boolean result = NumberComparator.compareNumbers(a, b, c);

		System.out.printf("Equality of numbers is %b", result);

		// second version
		// NumberComparator.compareNumbersIndividually(a, b, c);
	}
}
