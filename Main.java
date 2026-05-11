// Elijah Johnson
// Input/Output

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for two numbers
        System.out.print("Enter number (x): ");
        double x = input.nextDouble();

        System.out.print("Enter number (y): ");
        double y = input.nextDouble();

        
        double addition = x + y;
        double subtraction = x - y;
        double multiplication = x * y;

        
        String divisionResult;
        if (y != 0) {
            divisionResult = String.valueOf(x / y);
        } else {
            divisionResult = "undefined (cannot divide by zero)";
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Addition (x + y): " + addition);
        System.out.println("Subtraction (x - y): " + subtraction);
        System.out.println("Multiplication (x * y): " + multiplication);
        System.out.println("Division (x / y): " + divisionResult);

        input.close();
    }
}