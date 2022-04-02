import java.io.*;
import java.util.*;

public class GetMazePath {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();       
        ArrayList<String> res  = getMazePaths(0 , 0, n-1, m-1);
        System.out.println(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
         ArrayList<String> paths = new ArrayList<>();
       if(sc==dc && sr == dr){
            ArrayList<String> bres = new ArrayList<>();
             bres.add("");
             return bres;
       }else if(sc < dc && sr == dr){
              ArrayList<String> hpaths = getMazePaths(sr , sc+1,dr,dc); 
                 
        for(String res : hpaths){
            paths.add("h"+res);
        }
       }
        else if(sc == dc && sr < dr){            
            ArrayList<String> vpaths = getMazePaths(sr+1 ,sc ,dr, dc);
             for(String res : vpaths){
            paths.add("v"+res);
        }
        }
        else{
        ArrayList<String> hpaths = getMazePaths(sr , sc+1,dr,dc);  
        ArrayList<String> vpaths = getMazePaths(sr+1 ,sc ,dr, dc);
          
        for(String res : hpaths){
            paths.add("h"+res);
        }
        for(String res : vpaths){
            paths.add("v"+res);
        }
        }
        
      
                        
        return paths;
    }

}