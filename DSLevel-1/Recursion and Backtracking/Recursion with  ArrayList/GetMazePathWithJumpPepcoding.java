import java.io.*;
import java.util.*;

public class GetMazePathWithJumpPepcoding {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();       
        ArrayList<String> res  = getMazePaths(1 , 1, n, m);
        System.out.println(res);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
             bres.add("");//returning empty
             return bres;
        }

     ArrayList<String> paths = new ArrayList<>();
     //horizontal moves
    for(int ms=1 ; ms<=dc-sc ; ms++){
        ArrayList<String> hpaths = getMazePaths(sr ,sc+ms,dr,sc);
        for(String hpath : hpaths){
            paths.add("h"+ms+  hpath);
        }
    }

    //vertical moves
    for(int ms=1 ; ms<=dr-sr ; ms++){
        ArrayList<String> vpaths = getMazePaths(sr+ms ,sc,dr,sc);
        for(String vpath : vpaths){
            paths.add("v"+ms+  vpath);
        }
    }
    //diagonal moves
    for(int ms=1 ; ms<=dc-sc && ms<=dr-sr ; ms++){
        ArrayList<String> dpaths = getMazePaths(sr+ms ,sc+ms,dr,sc);
        for(String dpath : dpaths){
            paths.add("d"+ms+  dpath);
        }
    }
    return paths;

    }   
}