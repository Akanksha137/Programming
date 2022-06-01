import java.io.*;
import java.util.*;

public class QueenPermutations_QueenChooses {

    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int r, int c){
        
        if(qpsf == tq){
            for(int i = 0 ; i  < chess.length;i++){
                for(int j=0;j<chess.length;j++){
                    if(chess[i][j] == true){
                        System.out.print("q\t");
                    }
                    else{
                        System.out.print("-\t");
                    }
                }
                System.out.println();
            }System.out.println();
      
        return;
        }
        for(int i = c+1 ; i<tq;i++){
                chess[r][i]=true;
                queensCombinations(qpsf+1,tq,chess,r,i);
                chess[r][i]=false;
        }
        
        for(int i = r+1 ; i<tq;i++){
             for(int j = 0 ; j<tq;j++){
                chess[i][j]=true;
                queensCombinations(qpsf+1,tq,chess,i,j);
                chess[i][j]=false;
        }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];
        
        queensCombinations(0, n, chess, 0, -1);
    }
}