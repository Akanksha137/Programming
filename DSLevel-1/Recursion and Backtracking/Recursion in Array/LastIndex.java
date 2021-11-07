import java.io.*;
import java.util.*;

public class LastIndex {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner ( System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i =0 ;i< n ; i++){
            arr[i]=scn.nextInt();
        }
        int x = scn.nextInt();

        System.out.println(lastIndex(arr , arr.length , x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==0){
            return -1;
        }

        if(x == arr[idx-1]){
            return (idx-1);
        }
        return lastIndex(arr , idx-1 , x);
    }

}