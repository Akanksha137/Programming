import java.io.*;
import java.util.*;

public class FibonacciDp{

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int fibo = fibMemoise(n, new int[n+1]);
    System.out.println(fibo);
 }
    public static int fibMemoise(int n , int []qb ){
    if(n==0 || n==1){
    return n;
    }    

    if(qb[n]!=0){
    return qb[n];
    }
    int fibnm1= fibMemoise(n-1 , qb);
    int fibnm2 = fibMemoise(n-2 , qb);
    int fib = fibnm1 + fibnm2;
    qb[n]=fib;
 return fib;
    }
}