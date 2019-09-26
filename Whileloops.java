import java.util.Scanner;

public class Whileloops {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = 3;
        int x = 0;
        while(x<2){
            System.out.println("Enter a number (1,2,3)");
            int b = s.nextInt();
            if(b != a){
                int c = b*b;
                int d = b*b*b;
                System.out.println("Square: " + c + " Cube: " + d);
            }
            else{
                System.out.println("Entered 3, Program terminated");
                break;
            }
        }
    }
}
