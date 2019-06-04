package by.epam.javatraining.shmarlouski.lesson06.task04.model;

import static org.junit.Assert.*;
import org.junit.Test;
import static by.epam.javatraining.shmarlouski.lesson06.task04.model.NumberSchemer.*;

public class NumberSchemerTest {

	@Test
	public void testIsEvenNumberLessThanZero() {
		
		int number = -2012;
		boolean expected = false;
		
		assertEquals(expected, isEvenNumber(number));
	}
	
	@Test
	public void testIsEvenNumberIsTrue() {
		
		int number = 8642;
		boolean expected = true;
		
		assertEquals(expected, isEvenNumber(number));
	}
	
	@Test
	public void testIsEvenNumberIsFalse() {
		
		int number = 86421;
		boolean expected = false;
		
		assertEquals(expected, isEvenNumber(number));
	}

	@Test
	public void testIsOddNumberIsTrue() {

		int number = 1357;
		boolean expected = true;
		
		assertEquals(expected, isOddNumber(number));
	}
	
	@Test
	public void testIsOddNumberLessThanZero() {

		int number = -111;
		boolean expected = false;
		
		assertEquals(expected, isOddNumber(number));
	}

	@Test
	public void testIsOddNumberIsFalse() {

		int number = 1457;
		boolean expected = false;
		
		assertEquals(expected, isOddNumber(number));
	}
}
