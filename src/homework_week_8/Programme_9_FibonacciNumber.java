package homework_week_8;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme_9_FibonacciNumber {
    public static void isFibonacci(int count){
        int n1=0,n2=1,n3;
        System.out.println(n1+" "+n2);;

        //loop strat from 1 bcz 0 and 1 are already printed
        for(int i=2;i<count;i++){
            n3=n1+n2;
            System.out.println("" +n3);
            n1=n2;
            n2=n3;
        }

    }

    public static void main(String[] args) {
        //scanner declaration for reading input form console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Inout Fibonacci number count :");
        isFibonacci(scanner.nextInt());

        //closing the scanner object
        scanner.close();
    }

















}
