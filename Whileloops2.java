import java.util.Scanner;

public class Whileloops2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two integers to divide:");
        System.out.println("Enter your first integer");
        int a = s.nextInt();
        System.out.println();
        System.out.println("Enter your second integer");
        int b = s.nextInt();
        int y = 0;
        if(b<a){
            int n = 0;
            while(n<4){
                int c = a%b;
                if(a>=c) {
                    int d = a-b;
                    if(d>=0) {
                        a = a - b;
                        int x = 0;
                        x++;
                        y += x;
                        if(c>0) {
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("Solution = " + y + " " + c + "/" + b);
                        }
                        else{
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println("Solution = " + y);
                        }
                    }
                }
                else{
                    break;
                }
            }
        }
        else if(b==a){
            System.out.println("1");
        }
        else{
            System.out.println("Solution = " + a + "/" + b);
        }

    }
}
