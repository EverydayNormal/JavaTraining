package by.epam.javatraining.shmarlouski.lesson05.task02.model;

public class LetterChecker {

	public static boolean checkVowelOrNotVer1(char letter) {
		letter = Character.toLowerCase(letter);
		return (Character.isLetter(letter))
				&& (letter == 'e' || letter == 'y' || letter == 'u' 
				|| letter == 'i' || letter == 'o' || letter == 'a');
	}

	public static boolean checkVowelOrNotVer2(Character letter) {
		if (Character.isLetter(letter)) {
			letter = Character.toLowerCase(letter);
			char[] arrayOfChars = { 'e', 'y', 'u', 'i', 'o', 'a' };
			for (int i = 0; i < arrayOfChars.length; i++) {
				if (letter.equals(arrayOfChars[i])) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean checkVowelOrNotVer3(char letter) {
		letter = Character.toLowerCase(letter);
		if (Character.isLetter(letter) && Character.toString(letter).matches("[eyuioa]")) {
			return true;
		}
		return false;
	}
}
