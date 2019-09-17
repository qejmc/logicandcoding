public class Forloops {
    public static void main(String args[]){
        System.out.println("integer\tinteger^3");
        for(int x=1; x<=10; x++){
            int y= x*x*x;
            System.out.println(x + "\t" + y);
        }
        System.out.println();
        System.out.println("part b");
        for(int a=99; a>=1; a = a - 2){
            System.out.println(a);
        }
        System.out.println();
        System.out.println("part d");
        String s = "The quick brown fox jumped over the lazy dog";
        int l = s.length();
        for(int p=0; p<=(l-1); p++){
            char o = s.charAt(p);
            System.out.println(o);
        }
    }
}
