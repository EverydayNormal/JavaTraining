package task01;

public class NumberComparator {

	// version 1, that show equation in general
	public static boolean compareNumbers(double a, double b, double c) {
		return (a == b) && (c == a);
	}
	// version 2, that shows equation individually

	public static void compareNumbersIndividually(double a, double b, double c) {
		boolean ab = a == b;
		boolean bc = b == c;
		boolean ca = c == a;
		System.out.printf(
				"Number compare shows that equality of %.2f and %.2f is %b, "
						+ "equality of %.2f and %.2f is %b and finally equality of %.2f and %.2f is %b",
				a, b, ab, b, c, bc, c, a, ca);
	}
}
