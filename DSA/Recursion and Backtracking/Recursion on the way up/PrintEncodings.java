import java.io.*;
import java.util.*;

public class PrintEncodings {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    String str = scn.next();
    printEncodings(str  , "");
    }
    
    static String []codes={"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
    "u","v","w","x","y","z"};
    public static void printEncodings(String str, String asf) {
     
        if(str.length()==0){
            System.out.println(asf);
            return;
        }

         char ch = str.charAt(0);
         if(ch == '0'){
            return;
        }
        else{
        String sub = str.substring(1);
        printEncodings(sub ,asf+codes[(int)(ch - '0')]);    
        
        if(str.length()>=2){             
            int v1 = str.charAt(0) - '0';
            int v2 = str.charAt(1) - '0';
            int value = 10 * v1 + v2;
            if(value > 26){
                return;
            }
            String s = str.substring(2);
            printEncodings(s,asf+codes[value]); 
              
        }
        }
         
        }


}