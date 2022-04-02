import java.io.*;
import java.util.*;

public class CountABCSubsequences {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int a=0;
        int ab=0;
        int abc=0;

            for(int j=0;j<str.length();j++){
              if(str.charAt(j) == 'a'){
                  a=2*a+1;
              }
              else if(str.charAt(j)=='b'){
                  ab = 2*ab + a;
              }
              else if(str.charAt(j)=='c')
                abc = 2*abc+ab;


            }
      
        System.out.println(abc);

    }
}