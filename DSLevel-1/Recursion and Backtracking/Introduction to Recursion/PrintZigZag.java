import java.io.*;
import java.util.*;

public class PrintZigZag {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
       if(n==0){
           return; 
       } 
      for(int i=0;i<2;i++){
          System.out.print(n);
          pzz(n-1);
      }
       System.out.print(n);
    }

}