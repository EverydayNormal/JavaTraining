package task03;

import static org.junit.Assert.*;
import org.junit.Test;
import by.epam.javatraining.shmarlouski.lesson05.task03.model.MoodSensor;

public class MoodSensorTest {

	@Test
	public void testGetMood() {

		int a = 9;
		String expected = "\\('o' )/";
		
		assertEquals(expected, MoodSensor.findMood(a));
	}
	
	@Test
	public void testGetMoodE() {

		int a = -10;
		String expected = "(-_- )'";
		
		assertEquals(expected, MoodSensor.findMood(a));
	}
}
