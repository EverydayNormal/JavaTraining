package task02;

import static org.junit.Assert.*;
import org.junit.Test;
import by.epam.javatraining.shmarlouski.lesson05.task02.model.LetterChecker;

public class LetterCheckerTest {

	@Test
	public void testCheckVowelOrNotVer1() {

		char letter = 'a';
		boolean expected = true;

		assertEquals(expected, LetterChecker.checkVowelOrNotVer1(letter));
	}

	@Test
	public void testCheckVowelOrNotVer1isNotLetter() {

		char letter = '1';
		boolean expected = false;

		assertEquals(expected, LetterChecker.checkVowelOrNotVer1(letter));
	}

	@Test
	public void testCheckVowelOrNotVer2() {

		char letter = 'E';
		boolean expected = true;

		assertEquals(expected, LetterChecker.checkVowelOrNotVer2(letter));
	}

	@Test
	public void testCheckVowelOrNotVer2isNotLetter() {

		char letter = '-';
		boolean expected = false;

		assertEquals(expected, LetterChecker.checkVowelOrNotVer2(letter));
	}

	@Test
	public void testCheckVowelOrNotVer3() {

		char letter = 'O';
		boolean expected = true;

		assertEquals(expected, LetterChecker.checkVowelOrNotVer3(letter));
	}

	@Test
	public void testCheckVowelOrNotVer3isNotLetter() {

		char letter = '\u0012';
		boolean expected = false;

		assertEquals(expected, LetterChecker.checkVowelOrNotVer3(letter));
	}
}
