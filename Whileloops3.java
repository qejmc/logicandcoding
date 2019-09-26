import java.util.Scanner;

public class Whileloops3 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String a = "banana";
        String b = "orange";
        int p = 0;
        while(p<1){
            System.out.println("Knock, Knock. Who's there?");
            String c = s.nextLine();
            if(c.equals(a)){
                System.out.println("Banana who?");
            }
            else if(c.equals(b)){
                System.out.println("Orange you glad you didn't type banana?");
                break;
            }
            else{
                System.out.println("You are not playing my game very well.");
            }
        }

    }
}
