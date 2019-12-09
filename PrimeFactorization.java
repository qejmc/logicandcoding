import java.util.Arrays;
import java.util.Scanner;

public class PrimeFactorization {
    public static boolean[] collectPrimes = new boolean[1000];
    public static int[] primeInt = new int[168];
    public static int[] primeFactor = new int[1000];
    public static void main(String[] args){
        Arrays.fill(collectPrimes, true);
        collectPrimes[0] = false;
        collectPrimes[1] = true;
        for(int n = 2; n<1000; n++) {
            for (int x = 1; x <= 1000; x++) {
                if (x % n == 0 && x != n) {
                    collectPrimes[x - 1] = false;
                }
            }
        }
        assignInt();
        printPrimeFactors();
    }
    public static void assignInt(){
        Arrays.fill(primeInt, 1);
        int n = 0;
        for(int x = 0; x<1000; x++) {
            if (collectPrimes[x]) {
                primeInt[n] = x + 1;
                n++;
            }
        }
    }
    public static void printPrimeFactors(){
        Arrays.fill(primeFactor, 1);
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int x = s.nextInt();
        s.close();
        int y;
        int z = 0;
        if(x>1){
            while(x>1) {
                for(int n = 0; n < primeInt.length; n++) {
                    y = primeInt[n];
                    if (x % y == 0) {
                        x = x / y;
                        primeFactor[z] = y;
                        z++;
                    }
                }
            }
            for(int r = 0; r < primeFactor.length; r++){
                Arrays.sort(primeFactor);
                if(primeFactor[r] != 1){
                    System.out.println(primeFactor[r]);
                }
            }
        }
        else{
            System.out.println("Null.");
        }
    }
}