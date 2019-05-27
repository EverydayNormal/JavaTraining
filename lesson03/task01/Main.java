package task01;

public class Main {

	public static void main(String[] args) {
		
		//c - Celsius
		//f - Fahrenheit
		//k - Kelvin
		
		double temperature = 23.60d; 
		
		//In method user indicates his current type of temperature
		double convertedTemp = DegreesConverter.convertToFahrenheit(temperature, 'c');
		
		System.out.printf("Converted temperature is %.3f", convertedTemp);

	}

}
