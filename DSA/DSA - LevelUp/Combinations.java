import java.io.*;
import java.util.*;

public class Combinations {

  public static void combinations(int[] boxes, int ci, int ti, int lb){
      if(lb+1 == boxes.length){
          if(ci == ti+1){
              for(int i =0;i<boxes.length;i++){
                  if(boxes[i]==1){
                  System.out.print("i");
                  }
                  else{
                      System.out.print("-");
                  }
              }
              System.out.println();
          }
          return;
      }
     if(boxes[lb+1]==0){
     boxes[lb+1] = 1; 
     combinations(boxes,ci+1,ti,lb+1);
     boxes[lb+1]=0;
     }
     combinations(boxes,ci,ti,lb+1);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int nboxes = Integer.parseInt(br.readLine());
    int ritems = Integer.parseInt(br.readLine());
    combinations(new int[nboxes], 1, ritems, -1);
  }

}