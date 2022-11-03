package homework_week_8;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_FindVowelOrConsonant {
    public static void checkVowelOrConsonant(String letter) {

        //check length of the string if user enter more than 1 character an error message is printed
        if (letter.length() > 1) {
            System.out.println("Error : Not a single character");

            //if user enter symbol
        } else if (!(isItALetter(letter))) {
            System.out.println("Error: Not a letter.Enter uppercase or lowecase letter");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("input number is vow");
        } else {
            System.out.println("Input letter is consonant ");

        }

    }

    //This method will check is it letter or not?
    public static boolean isItALetter(String I) {
        return I.charAt(0) > 96 && I.charAt(0) < 123;
    }

    public static void main(String[] args) {

        //Scanner declaration for reading input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character:");
        String str = scanner.next().toLowerCase();

        //calling static method directly
        checkVowelOrConsonant(str);

        //closing the scanner object
        scanner.close();
    }
}











