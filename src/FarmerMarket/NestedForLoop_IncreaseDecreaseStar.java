package FarmerMarket;

import java.util.Scanner;

public class NestedForLoop_IncreaseDecreaseStar {

    public static void main(String[] args) {

        /*
         Ask the user for a row value and print to the console in the following manner:
         If the user enters 4, there will be 4 increasing rows followed by 3 decreasing rows.
         If the user enters 10, there will be 10 increasing rows followed by 9 decreasing rows.
        */

        // *
        // * *
        // * * *
        // * * * *
        // * * *
        // * *
        // *

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of lines you want to print");
        int line = scanner.nextInt();

        for (int i = 1; i <= line ; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print("* ");

            }
            System.out.println();

        }

        for (int i = line-1 ; i >=1 ; i--) {

            for (int j = i; j >=1  ; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

