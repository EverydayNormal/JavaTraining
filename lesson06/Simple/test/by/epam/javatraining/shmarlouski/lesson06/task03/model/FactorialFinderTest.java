package by.epam.javatraining.shmarlouski.lesson06.task03.model;

import static org.junit.Assert.*;
import org.junit.Test;
import  static by.epam.javatraining.shmarlouski.lesson06.task03.model.FactorialFinder.findFactorial;

public class FactorialFinderTest {

	@Test
	public void testFindFactorial() {

		int number = 5;
		int expected = 120;
		
		assertEquals(expected , findFactorial(number));
	}
	
	@Test
	public void testFindFactorialNumberIsZero() {

		int number = 0;
		int expected = 1;
		
		assertEquals(expected , findFactorial(number));
	}

	@Test
	public void testFindFactorialNumberIsOne() {

		int number = 1;
		int expected = 1;
		
		assertEquals(expected , findFactorial(number));
	}
}
