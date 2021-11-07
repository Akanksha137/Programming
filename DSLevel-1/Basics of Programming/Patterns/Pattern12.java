import java.util.*;

public class Pattern12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int fib=0,fib1=0,fib2=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
               System.out.print(fib1 + "\t");
               fib=fib1+fib2;
               fib1=fib2;
               fib2=fib;
            }
            System.out.println();
        }

    }
}