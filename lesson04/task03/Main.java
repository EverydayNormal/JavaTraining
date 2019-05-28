package lesson04.task03;
import lesson04.task01.Printer;

public class Main {

	public static void main(String[] args) {

		int number = 4321;

		NumberSchemer.separateDigits(number);

		boolean arisingCheck = NumberSchemer.checkArising();
		boolean descendingCheck = NumberSchemer.checkDescending();

		Printer.print("Arising of digits in number " + number + " is " + arisingCheck);
		Printer.print("Descending of digits in number " + number + " is " + descendingCheck);
		}
}
