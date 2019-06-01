package task02.controller;

import static task02.view.Printer.print;
import static task02.model.LetterChecker.*;

public class Main {

	public static void main(String[] args) {

		char someLetterChar = 'e';
		// boolean result = checkVowelOrNotVer1(someLetterChar);
		// boolean result = checkVowelOrNotVer2(someLetterChar);
		boolean result = checkVowelOrNotVer3(someLetterChar);

		print(result ? someLetterChar + " is a vowel" : someLetterChar + " is not a vowel");
	}
}
