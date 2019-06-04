package by.epam.javatraining.shmarlouski.lesson06.task02.model;

import static org.junit.Assert.*;
import org.junit.Test;
import static by.epam.javatraining.shmarlouski.lesson06.task02.model.NumberSchemer.*;

public class NumberSchemerTest {

	@Test
	public void testCheckArising() {
		int number = 1234;
		boolean expected = true;

		assertEquals(expected, checkArising(number));
	}

	@Test
	public void testCheckArisingNegativeNumber() {
		int number = -12;
		boolean expected = false;

		assertEquals(expected, checkArising(number));
	}

	@Test
	public void testCheckDescending() {
		int number = 4321;
		boolean expected = true;

		assertEquals(expected, checkDescending(number));
	}
	
	@Test
	public void testCheckDescendingNegativeNumber() {
		int number = -4321;
		boolean expected = false;

		assertEquals(expected, checkDescending(number));
	}
}
