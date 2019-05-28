package lesson04.task05;

public class Main {

	public static void main(String[] args) {

		int number = 4214231;

		NumberSchemer.separateNumbers(number);
		int reverseNumber = NumberSchemer.reverseDigits();

		System.out.printf("Reversed version of number %d will be %d", number, reverseNumber);
	}
}
