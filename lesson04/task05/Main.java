package task05;

public class Main {

	public static void main(String[] args) {
		int number = 4214231;
		int reverseNumber = 0;

		NumberSchemer.separateNumbers(number);
		reverseNumber = NumberSchemer.reverseDigits();

		System.out.printf("Reversed version of number %d will be %d", number, reverseNumber);
	}
}
