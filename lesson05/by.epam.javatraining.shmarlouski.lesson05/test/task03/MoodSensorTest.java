package task03;

import static org.junit.Assert.*;
import org.junit.Test;
import task03.model.MoodSensor;

public class MoodSensorTest {

	@Test
	public void testGetMood() {

		int a = 9;
		String expected = "\\('o' )/";
		
		assertEquals(expected, MoodSensor.getMood(a));
	}
	
	@Test
	public void testGetMoodE() {

		int a = 9;
		String expected = "\\('o' )/";
		
		assertEquals(expected, MoodSensor.getMood(a));
	}
}
