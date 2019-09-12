
public class Iteration_Explore
{
    public static void main( String[] args) {
        int sumInt, square;

        System.out.println();
        System.out.println("i\tsumInt\tsquare i");

        sumInt = 0;
        for(int i = 1; i <= 10; i ++) {
            sumInt += i;
            square = i * i;
            System.out.println(i + "\t" + sumInt + "\t" + square);
        }

        System.out.println();
        System.out.println("j\tj!");
        int f = 1;
        for(int j = 1; j <= 10; j ++){
            f *= j;
            System.out.println(j + "\t" + f);
        }



    }
}
