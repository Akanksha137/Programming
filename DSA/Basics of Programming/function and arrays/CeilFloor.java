import java.io.*;
import java.util.*;

public class CeilFloor{

public static void main(String[] args) throws Exception {
   Scanner scn=new Scanner(System.in);
   int n = scn.nextInt();
   int []a=new int[n];
   for(int i=0;i<n;i++){
       a[i]=scn.nextInt();
   }
   int data=scn.nextInt();
   int l=0;
   int h=n-1;
   int ceil=-1;
   int floor=-1;
   int m=-1;
   while(l<=h){      
        m = (l + h)/2;
       if(data>a[m]){        
           l = m + 1;
           floor=a[m];
       }
       else if(data < a[m]){           
           h = m - 1;
           ceil=a[m];
       }
       else{
            ceil=a[m];
            floor=a[m];
           break;
       }
   }
   System.out.println(ceil);
   System.out.println(floor);
 }

}