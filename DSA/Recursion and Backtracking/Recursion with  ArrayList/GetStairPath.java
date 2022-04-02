import java.io.*;
import java.util.*;

public class GetStairPath {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> res = getStairPaths(n);
        System.out.println(res);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0){
             ArrayList<String> bres= new ArrayList<>();
            return bres;
        }
       ArrayList<String> paths1 = getStairPaths(n-1);
       ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);
         ArrayList<String> paths = new ArrayList<>();
         for(String r : paths1){
             paths.add(1 + r);
         }
         for(String r : paths2){
             paths.add(2 + r);
         }
         for(String r : paths3){
             paths.add(3 + r);
         }
        return paths;
    }

}