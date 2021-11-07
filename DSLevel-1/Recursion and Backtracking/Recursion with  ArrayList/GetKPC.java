import java.io.*;
import java.util.*;

public class GetKPC {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = getKPC(str);
        System.out.println(res);
    }
    static String []codes = {".;", "abc", "def","ghi", "jkl", "mno","pqrs","tu", "vwx","yz"};
    public static ArrayList<String> getKPC(String str) {

        if(str.length() == 0){
             ArrayList<String> bres = new ArrayList<>();
             bres.add("");
             return bres;
        }
        char ch = str.charAt(0);
        
        String res = str.substring(1);
        ArrayList<String> rres = getKPC(res);
        String s = codes[(int)ch-48];
        ArrayList<String> mres = new ArrayList<>();
         for(int i=0; i<s.length();i++){
        for(String r : rres){
                 mres.add(s.charAt(i) + r);
            }
           
        }
        return mres;
    }

}