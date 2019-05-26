package task02;

public class Main {

	public static void main(String[] args) {

		double R1 = 22.3d;
		double R2 = 12.2d;

		double rs = RoundLogic.findSquare(R1, R2);

		System.out.printf("The ring's square is %.3f ", rs);
	}
}
