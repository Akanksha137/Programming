import java.util.*;
import java.io.*;;
public class SpanOfaArray{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int min=minfunc(arr, n);
        int max=maxfunc(arr,n);

        System.out.println(max-min);

    }

   static int minfunc(int []arr,int n){
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
   static int maxfunc(int []arr,int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}