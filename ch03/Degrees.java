/**
 * Converts a temperature from Celsius to Fahrenheit
 */

import java.util.Scanner;

public class Degrees {
	public static void main(String[] args) {
		double tempCelsius = 0.0;
		
		Scanner scannerIn = new Scanner(System.in);
		
		System.out.print("What is the temperature in Celsius? ");
		tempCelsius = scannerIn.nextDouble();
		
		System.out.printf("%.1f Celsius is %.1f Fahrenheit.", tempCelsius, 
				tempCelsius * 9.0 / 5.0 + 32 );
		scannerIn.close();
	}

}
