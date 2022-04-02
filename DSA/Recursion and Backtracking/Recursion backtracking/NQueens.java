import java.io.*;
import java.util.*;

public class NQueens {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int [][]chess = new int[n][n];
       printNQueens(chess , "" , 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
       
      if(row == chess.length){
          System.out.println(qsf + ".");
          return;
      }
       
      for(int j=0;j<chess[0].length;j++){
          if(IsSafe(chess , row ,j)==true){
          chess[row][j]=1;
          printNQueens(chess , qsf+row+"-"+j + ", ",row+1);
          chess[row][j]=0;
          }
       }
    }
    
    public static boolean IsSafe(int [][]chess , int row, int column){
        for(int i=row-1;i>=0;i--){
             if(chess[i][column] == 1){
                 return false;
             }
            
        }
        for(int i=row-1,j=column-1;i>=0 && j>=-0;i--,j--){
             if(chess[i][j] == 1){
                 return false;
             }
            
        }
        for(int i=row-1,j=column+1;i>=0 && j<=chess.length-1;i--,j++){
             if(chess[i][j] == 1){
                 return false;
             }
            
        }
        return true;
    }
}