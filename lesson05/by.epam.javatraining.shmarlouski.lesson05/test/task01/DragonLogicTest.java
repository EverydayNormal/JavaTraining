package task01;

import static org.junit.Assert.*;

import org.junit.Test;

public class DragonLogicTest {

	@Test
	public void testGetNumberOfHeads() {

		int dragonYears = 100;
		int expected = 303;

		assertEquals(expected, DragonLogic.getNumberOfHeads(dragonYears));
	}

	@Test
	public void testGetNumberOfHeadsZeroYears() {

		int dragonYears = 0;
		int expected = 3;

		assertEquals(expected, DragonLogic.getNumberOfHeads(dragonYears));
	}

	@Test
	public void testGetNumberOfHeadsNegativeYears() {

		int dragonYears = -35;
		int expected = 0;

		assertEquals(expected, DragonLogic.getNumberOfHeads(dragonYears));
	}

	@Test
	public void testGetNumberOfHeadsTooManyYears() {

		int dragonYears = Integer.MAX_VALUE;
		int expected = 0;

		assertEquals(expected, DragonLogic.getNumberOfHeads(dragonYears));
	}

	@Test
	public void testGetNumberOfEyes() {

		int heads = 3;
		int expected = 6;

		assertEquals(expected, DragonLogic.getNumberOfEyes(heads));
	}

	@Test
	public void testGetNumberOfEyesLesserThanZero() {

		int heads = 0;
		int expected = 0;

		assertEquals(expected, DragonLogic.getNumberOfEyes(heads));
	}
}
