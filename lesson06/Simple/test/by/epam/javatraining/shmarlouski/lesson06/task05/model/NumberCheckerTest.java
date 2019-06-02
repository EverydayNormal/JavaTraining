package by.epam.javatraining.shmarlouski.lesson06.task05.model;

import static org.junit.Assert.*;
import org.junit.Test;
import static by.epam.javatraining.shmarlouski.lesson06.task05.model.NumberChecker.isPrimeNumber;

public class NumberCheckerTest {

	@Test
	public void testIsPrimeNumberLessThanZero() {

		int number = - 12;
		boolean expected = false;
		
		assertEquals(expected, isPrimeNumber(number));
		
	}
	
	@Test
	public void testIsPrimeNumberTrue() {

		int number = 1;
		boolean expected = true;
		
		assertEquals(expected, isPrimeNumber(number));
		
	}

}
