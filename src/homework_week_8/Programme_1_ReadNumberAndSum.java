package homework_week_8;
/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number
 * the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class Programme_1_ReadNumberAndSum {


    public static void readTenNumberAndSum() {

        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number#" + order + ":");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;

                if (counter == 10) {
                    break;

                }
            } else {
                System.out.println("Invlaid number");
            }
            scanner.nextLine();//handle end of the line(enter key)
        }
        System.out.println("sum=" + sum);
        //closing the scanner object
        scanner.close();

    }

    public static void main(String[] args) {
        readTenNumberAndSum();
    }
}







