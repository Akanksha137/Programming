import java.io.*;
import java.util.*;

public class GetSequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
       char ch = str.charAt(0);
       String res = str.substring(1);
       ArrayList<String> rres = gss(res);
       ArrayList<String> myres = new ArrayList<>();
       for(String rstr : rres){
           myres.add(""  + rstr);           
       }
        for(String rstr : rres){           
           myres.add(ch  + rstr);
       }
       return myres;
    }

}