package task01;

public class DegreesConverter {

	public static double convertToCelsius(double temperature, char type) {
		if (type == 'f') {
			return (temperature - 32) / 1.8 ;
		} else if (type == 'k') {
			return temperature - 273;
		}
		return temperature;
	}

	public static double convertToFahrenheit(double temperature, char type) {
		if (type == 'c') {
			return temperature * 1.8 + 32 ;
		} else if (type == 'k') {
			return 1.8 * (temperature - 273) + 32;
		}
		return temperature;
	}

	public static double convertToKelvin(double temperature, char type) {
		if (type == 'c') {
			return temperature + 273;
		} else if (type == 'f') {
			return(temperature + 459.67) * 5/9;
		}
		return temperature;
	}

}
