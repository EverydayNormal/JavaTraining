package lesson04.task04;

public class Main {

	public static void main(String[] args) {
		double number = 152358;

		Finder.separateNumbers(number);
		
		double arithmeticalAverage = Finder.findArithmeticalAverage();
		double geometricAverage = Finder.findGeometricAverage();

		System.out.printf("Arithmetical average of number %.1f is %f%n", number, arithmeticalAverage);
		System.out.printf("Geometric average of number %.1f is %f", number, geometricAverage);
	}
}
