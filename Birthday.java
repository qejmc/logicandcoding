/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter birth month");  //prompt the user for a birth month
        double x = keys.nextInt();
        System.out.println("Enter birth year");
        double y = keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month
        if (x == 9 || x == 4 || x == 6 || x == 7){
            System.out.println("30 days");
        }
        else if ((x == 2) && (y%4 == 0)){
            System.out.println("29 days");
        }
        else if ((x == 2) && !(y%4 == 0)){
            System.out.println("28 days");
        }
        else {
            System.out.println("31 days");
        }
    }
}