import java.util.Scanner;

public class Challengeproblems {
    public static void main(String args[]){
        System.out.println("How many numbers do you intend to enter?");
        Scanner keys = new Scanner(System.in);
        int x  = keys.nextInt();
        int sum = 0;
        for(int y = 1; y<=x; y++) {
            System.out.println("next int");
            int a = keys.nextInt();
            sum += a;
            double avg = sum/x;
            int max = Math.max(a, y-1);
            int min = Math.min(a, y-1);
            if(x == y){
                System.out.println();
                System.out.println("Sum of your integers");
                System.out.println(sum);
                System.out.println();
                System.out.println("Average of your integers");
                System.out.println(avg);
                System.out.println();
                System.out.println("Maximum integer");
                System.out.println(max);
                System.out.println();
                System.out.println("Minimum integer");
                System.out.println(min);

            }
        }





    }

}
