package lesson03.task01;

public class DegreesConverter {

	public static double convertToCelsius(double temperature, char type) {
		switch (type) {
		case 'f':
			return (temperature - 32) / 1.8;
		case 'k':
			return temperature - 273;
		default:
			return temperature;
		}
	}

	public static double convertToFahrenheit(double temperature, char type) {
		switch (type) {
		case 'c':
			return temperature * 1.8 + 32;
		case 'k':
			return 1.8 * (temperature - 273) + 32;
		default:
			return temperature;
		}
	}

	public static double convertToKelvin(double temperature, char type) {
		switch (type) {
		case 'c':
			return temperature + 273;
		case 'f':
			return (temperature + 459.67) * 5 / 9;
		default:
			return temperature;
		}
	}
}
