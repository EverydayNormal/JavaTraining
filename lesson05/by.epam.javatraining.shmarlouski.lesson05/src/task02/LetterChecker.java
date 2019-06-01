package task02;

public class LetterChecker {

	public static boolean checkVowelOrNotVer1(char letter) {
		return (Character.isLetter(letter))	&& (letter == 'E' || letter == 'e' 
				|| letter == 'Y' || letter == 'y'
				|| letter == 'U' || letter == 'u' 
				|| letter == 'I' || letter == 'i' 
				|| letter == 'O' || letter == 'o'
				|| letter == 'A' || letter == 'a');
	}

	public static boolean checkVowelOrNotVer2(Character letter) {
		if (Character.isLetter(letter)) {
			char[] arrayOfChars = { 'E', 'e', 'Y', 'y', 'U', 'u', 'I', 'i', 'O', 'o', 'A', 'a' };
			for (int i = 0; i < arrayOfChars.length; i++) {
				if (letter.equals(arrayOfChars[i])) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean checkVowelOrNotVer3(char letter) {
		if (Character.isLetter(letter) && Character.toString(letter).matches("[EeYyUuIiOoAa]")) {
			return true;
		}
		return false;
	}
	
	public static boolean checkVowelOrNotRussian(char letter) {
		if (Character.isLetter(letter) && Character.toString(letter).matches("[УуЕеЫыАаОоЭэЯяИиЮю]")) {
			return true;
		}
		return false;
	}
}
