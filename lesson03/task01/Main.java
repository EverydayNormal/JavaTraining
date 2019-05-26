package task01;

public class Main {

	public static void main(String[] args) {
		
		//c - Celsius
		//f - Fahrenheit
		//k - Kelvin
		
		double temperature = 23.60d;
		
		double convertedTemp = DegreesConverter.convertToFahrenheit(temperature, 'f');
		
		System.out.printf("Converted temperature is %f", convertedTemp);

	}

}
