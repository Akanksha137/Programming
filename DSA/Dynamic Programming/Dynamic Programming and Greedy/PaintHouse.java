import java.io.*;
import java.util.*;

public class PaintHouse {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][]arr = new int[n][3];
       
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
            arr[i][j] = scn.nextInt();
            }
        }

        int r=arr[0][0];
        int b = arr[0][1];
        int g= arr[0][2];

         for(int i=1;i<n;i++){
               int j=0;
                int nr = arr[i][j]+Math.min(b ,g);
                int nb = arr[i][j+1]+Math.min(r ,g);
                int ng = arr[i][j+2]+Math.min(r ,b);
                r=nr;
                b=nb;
                g=ng;
               
        }  
        
        int ans = Math.min(r,b);
        ans = Math.min(ans,g);
        System.out.println(ans);

    }
}