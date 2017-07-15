/**
 * "Guess My Number" exercise.
 */

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

    public static void main(String[] args) {
    	
    	int difference;
        
    	// pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        
        System.out.println("I'm thinking of a number between 1 and 100\n(including both)"
        		+ ". Can you guess what it is?");
        System.out.println("Type a number: ");
        
        Scanner scannerIn = new Scanner(System.in);
        int guess = scannerIn.nextInt();
        
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of is: " + number);
        
        if (guess > number) {
        	difference = guess - number;
        }
        else {
        	difference = number - guess;
        }
        System.out.println("You were off by: " + difference);
        
        scannerIn.close();
    }

}
