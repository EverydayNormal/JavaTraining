package task02;

import static task01.Printer.print;

public class Main {

	public static void main(String[] args) {

		char someLetterChar = 'e';
		// boolean result = LetterChecker.checkVowelOrNotVer1(someLetterChar);
		// boolean result = LetterChecker.checkVowelOrNotVer2(someLetterChar);
		boolean result = LetterChecker.checkVowelOrNotVer3(someLetterChar);
	
		
		print(result ? someLetterChar + " is a vowel" : someLetterChar + " is not a vowel");
	}
}
