import java.util.Scanner;

/**
 * Converts number of seconds to hour, minutes, seconds.
 */
public class ConvertSeconds {
	public static void main(String[] args) {
		
		int enteredSeconds;
		int numHours;
		int numMinutes;
		int numSeconds;
		
		Scanner scannerIn = new Scanner(System.in);
		
		System.out.print("How many seconds? ");
		enteredSeconds = scannerIn.nextInt();
		
		numHours = enteredSeconds / 3600;
		numMinutes = (enteredSeconds % 3600) / 60;
		numSeconds = enteredSeconds % 60;
		
		System.out.printf("%d seconds is %d hour(s), %d minutes, and %d seconds", 
				enteredSeconds, numHours, numMinutes, numSeconds);
		scannerIn.close();
	}

}
