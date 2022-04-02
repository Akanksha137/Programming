import java.io.*;
import java.util.*;

public class PalindromeSubstrings {

	public static void solution(String str){
		
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				String s=str.substring(i,j);
				boolean flag=true;
				if(s.length()>1){
				flag=palindrome(s);
				}
				//outside this bcoz if s length not greater than 1 then print the s
				if(flag){
					System.out.println(s);
				}
			}
		}
		
	}
	public static boolean palindrome(String str ){
		int li=0;
		int ri=str.length()-1;
		while(li<=ri){
			if(str.charAt(li)!=str.charAt(ri)){
				return false;
			}
			li++;
			ri--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}