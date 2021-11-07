import java.io.*;
import java.util.*;

public class AllIndices {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }
    //fsf == found so far
    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        int []index ;
        if(idx==arr.length){
           index = new int[fsf];
            return index;
        }
      if(arr[idx]==x){          
          index=allIndices(arr , x, idx+1 , fsf+1);
          index[fsf]=idx;
           }
      else{
          index=allIndices(arr , x ,idx+1 , fsf);
      }
        return index;

    }

}