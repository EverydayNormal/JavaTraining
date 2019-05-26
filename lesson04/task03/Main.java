package task03;

public class Main {

	public static void main(String[] args) {

		int number = 4321;

		NumberSchemer.separateDigits(number);

		boolean arisingCheck = NumberSchemer.checkArising();
		boolean descendingCheck = NumberSchemer.checkDescending();

		System.out.printf("Arising of digits in number %d is %b %n", number, arisingCheck);
		System.out.printf("Descending of digits in number %d is %b", number, descendingCheck);

	}
}
