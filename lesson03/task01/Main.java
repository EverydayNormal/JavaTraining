package lesson03.task01;

import static lesson03.task01.Printer.print;

public class Main {

	public static void main(String[] args) {

		// c - Celsius
		// f - Fahrenheit
		// k - Kelvin

		double temperature = 36.6d;

		// In method User indicates his current type of temperature with a small letter.
		// For example (36,6 , 'c') where 'c' is Celsius
		// If User's type equals convert type, User get his temperature back

		double convertedTempFirst = DegreesConverter.convertToFahrenheit(temperature, 'c');
		double convertedTempSecond = DegreesConverter.convertToFahrenheit(temperature, 'c');
		double convertedThird = DegreesConverter.convertToCelsius(temperature, 'c');
		
		print("Converted temperature is " + convertedTempFirst);
		print("Converted temperature is " + convertedTempSecond);
		print("Converted temperature is " + convertedThird);
	}
}
