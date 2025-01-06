package task.tracker.cli;

import java.util.Scanner;
public class App {
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a number: ");
        int nombre = scanner.nextInt();
        int otherNumber = 5;
        int result = nombre + otherNumber;
        System.out.println("Result: " + result);

        scanner.close();
        
    }
}
