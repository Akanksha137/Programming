import java.io.*;
import java.util.*;

public class PrintKPC {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    printKPC(str , "");
    }
    static String []codes = {".;", "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu", "vwx" , "yz" };
    public static void printKPC(String str, String asf) {
    
    if(str.length()==0){
        System.out.println(asf);
        return;
    }
    
      char ch = str.charAt(0);
      String fsub = str.substring(1);
      int value =(int)( ch-'0');
      String s = codes[value];
      for(int i = 0 ;i<s.length();i++){
      printKPC(fsub , asf + s.charAt(i) );  
      }
        
    }

}