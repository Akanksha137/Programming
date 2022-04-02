import java.io.*;
import java.util.*;

public class ToggleCasePepcoding {

	public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);//converting to stringBuilder format
		
	    for(int i=0;i<sb.length();i++){
          char ch = sb.charAt(i);
		  if(ch  >= 'a' && ch <= 'z'){ // checking for lowercase
			  char uch = (char)('A' + ch - 'a'); //making upper case as difference between a  - p == A - P
			  sb.setCharAt(i , uch); //setting character at ith position 
		  }
		  else if ( ch >= 'A' && ch <= 'Z'){
			   char lch = (char)('a' + ch - 'A');
			   sb.setCharAt(i , lch);
		  }		  
        }
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}