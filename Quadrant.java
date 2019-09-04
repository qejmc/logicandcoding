/**
 * Skeleton of a program that takes in an ordered pair and prints the quadrant in which it lies.
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Quadrant
{
    public static void main( String[] args) {
        //variable declarations
        
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter x coord");  //prompt the user for an x-coordinate
        double x = keys.nextDouble();
        System.out.println("Enter y coord");  //prompt the user for a y-coordinate
        double y = keys.nextDouble();
        keys.close();
        
        //determine the quadrant in which the user's order pair lies
        if (x>0 && y>0){
            System.out.println("The point ("+x+" , "+y+") is located in quadrant 1");
        }
        else if (x<0 && y>0){
            System.out.println("The point ("+x+" , "+y+") is located in quadrant 2");
        }
        else if (x<0 && y<0){
            System.out.println("The point ("+x+" , "+y+") is located in quadrant 3");
        }
        else if (x>0 && y<0){
            System.out.println("The point ("+x+" , "+y+") is located in quadrant 4");
        }
        else {
            System.out.println("The point ("+x+" , "+y+") is located in quadrant null");
        }
        
        
    }
}