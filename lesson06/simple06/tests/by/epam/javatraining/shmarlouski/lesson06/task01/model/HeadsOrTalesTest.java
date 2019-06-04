package by.epam.javatraining.shmarlouski.lesson06.task01.model;

import static org.junit.Assert.*;
import static by.epam.javatraining.shmarlouski.lesson06.task01.model.HeadsOrTales.getResult;
import org.junit.Test;

public class HeadsOrTalesTest {

	@Test
	public void testGetResultNegativeNumber() {

		int turn = -12;
		String expected = "Number of throws must be positive";

		assertEquals(expected, getResult(turn));
	}

	// Don't know what else could be checked in this method because is return String
	// message + random results
}
