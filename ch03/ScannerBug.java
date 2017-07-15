import java.util.Scanner;

/**
 * Demonstrates a common problem using Scanner.
 */
public class ScannerBug {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.print("What is your age? ");
        age = in.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);

        System.out.print("What is your age? ");
        age = in.nextInt();
        in.nextLine();  // read the newline
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
        
        // close the scanner
        in.close();
    }

}
