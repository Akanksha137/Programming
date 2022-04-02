import java.io.*;
import java.util.*;

public class GetMazePathWithJump {

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
        //checking for if source greater than destination
        if(sc>dc || sr>dr  || (sc>dc && sr >dr)){
        ArrayList<String> bres = new ArrayList<>();//returning nothing
             return bres;
        }
       //checking if source is equal to destination
       else if(sc==dc && sr == dr){
            ArrayList<String> bres = new ArrayList<>();
             bres.add("");//returning empty
             return bres;
       }//checking for if any rows or columns less than destination source or column and acording to that calculating paths
       else if(sc < dc && (sr == dr)){
       for(int i=1;i<=dc-sc;i++){ 
        ArrayList<String> hpaths = getMazePaths(sr , sc+i,dr,dc); 
        for(String res : hpaths){
            paths.add("h"+i+res);//returning horizontal path as well as jumps steps
        }
        }
       }
        else if( sr < dr && (sc==dc)){   
             for(int i=1;i<=dr-sr;i++){          
            ArrayList<String> vpaths = getMazePaths(sr+i ,sc ,dr, dc);
             for(String res : vpaths){
            paths.add("v"+i+res);//returning vertical path as well as jumps steps
             }
        }
        }
        // nothing from above then do this steps
        else{
          for(int i=1;i<=dc-sc;i++){  //for horizontal path and jumps
        ArrayList<String> hpaths = getMazePaths(sr , sc+i,dr,dc);         
          
        for(String res : hpaths){
            paths.add("h"+i+res);
        }
          }
           for(int i=1;i<=dr-sr;i++){   //for vertical path and jumps
           ArrayList<String> vpaths = getMazePaths(sr+i ,sc ,dr, dc);
       
        for(String res : vpaths){
            paths.add("v"+i+res);
        }
           }
        for(int i=1;i<=dr-sr;i++){  //for daigonal path and jumps
            for(int j=1;j<=dc-sc;j++){  
                if(i==j){
         ArrayList<String> dpaths = getMazePaths(sr+i ,sc+j ,dr, dc);
        for(String res : dpaths){
            paths.add("d"+i+res);//returning diagonal path as well as jumps steps
        }
        }
            }
        }
        }   
        return paths;
    }

}