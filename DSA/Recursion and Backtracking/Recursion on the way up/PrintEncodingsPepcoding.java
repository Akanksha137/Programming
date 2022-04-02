import java.io.*;
import java.util.*;

public class PrintEncodingsPepcoding {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner (System.in);
    String str = scn.next();
    printEncodings(str  , "");
    }
    
   
    public static void printEncodings(String ques, String asf) {
     
       if(ques.length()==0){
           System.out.println(asf);
       }
       else if(ques.length()==1){
           char ch = ques.charAt(0);
           if(ch == '0'){
               return;
           }
           else {
               int chv = ch - '0';
               char code = (char)('a' + chv -1);//converting into a b c 
               System.out.println(asf + code);               
           }
       }
       else{
           char ch = ques.charAt(0);
           String roq = ques.substring(1);
            if(ch == '0'){
               return;
           }
           else {
               int chv = ch - '0';
               char code = (char)('a' + chv -1);//converting into a b c               
               printEncodings(roq , asf + code);              
           }
           String ch1 = ques.substring(0,2);
           String sub = ques.substring(2);
          int ch12 = Integer.Parse(ch1);
          if(ch12  < =26){
              char code = (char)( 'a' + ch12-1;
              printEncodings(sub , asf+code);
          }

           
       }

     
    
         
    }
}