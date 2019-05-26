package task02;

public class NumberReplace {

	public static void main(String[] args) {

		double a = 12.23d;
		double b = 23.34d;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.printf("At first number \"a\" was %.2f and now it's %.2f%n", b, a);
		System.out.printf("At first number \"b\" was %.2f and now it's %.2f", a, b);
	}
}
