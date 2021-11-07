import java.util.*;

public class Pattern17 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int st=0;
        for(int i=0;i<n;i++){
        if(i==(n)/2){
           for(int j=0;j<n/2;j++){
               System.out.print("*\t");
           }
        }
        else{
           for(int j=0;j<n/2;j++){
               System.out.print("\t");
           } 
        }
        if(i<=n/2){
            st++;
        }
        else{
            st--;
        }
        for(int j=0;j<st;j++){
               System.out.print("*\t");
           }
           System.out.println();
        }

    }
}