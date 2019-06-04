package by.epam.javatraining.shmarlouski.lesson05.task02.controller;

import static by.epam.javatraining.shmarlouski.lesson05.task02.view.Printer.print;
import static by.epam.javatraining.shmarlouski.lesson05.task02.model.LetterChecker.*;

public class Main {

	public static void main(String[] args) {

		char someLetterChar = '5';
		//boolean result = checkVowelOrNotVer1(someLetterChar);
		//boolean result = checkVowelOrNotVer2(someLetterChar);
		boolean result = checkVowelOrNotVer3(someLetterChar);

		print(result ? someLetterChar + " is a vowel" : someLetterChar + " is not a vowel");
	}
}
