//Elijah Johnson
//UML
//Controlling Loops

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice = 0;
        int x = 0;
        int y = 0;

        while (choice != 5) {

            // Menu
            System.out.println("\n1 - Enter two numbers");
            System.out.println("2 - Print numbers between x and y");
            System.out.println("3 - Find the average");
            System.out.println("4 - Find prime numbers");
            System.out.println("5 - Exit");

            System.out.print("Choose an option: ");
            choice = input.nextInt();

            //1
            if (choice == 1) {

                System.out.print("Enter x: ");
                x = input.nextInt();

                System.out.print("Enter y: ");
                y = input.nextInt();
            }

            //2
            else if (choice == 2) {

                System.out.println("Numbers between x and y:");

                for (int i = x; i <= y; i++) {
                    System.out.print(i + " ");
                }

                System.out.println();
            }

            //3
            else if (choice == 3) {

                int sum = 0;
                int count = 0;

                for (int i = x; i <= y; i++) {
                    sum = sum + i;
                    count++;
                }

                double average = (double) sum / count;

                System.out.println("Average = " + average);
            }

            //4
            else if (choice == 4) {

                System.out.println("Prime numbers:");

                for (int i = x; i <= y; i++) {

                    int factors = 0;

                    for (int j = 1; j <= i; j++) {

                        if (i % j == 0) {
                            factors++;
                        }
                    }

                    if (factors == 2) {
                        System.out.print(i + " ");
                    }
                }

                System.out.println();
            }

            //5
            else if (choice == 5) {

                System.out.println("Program ended.");
            }

            // Invalid choice
            else {

                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}