import java.io.*;
import java.util.*;

public class StringCompression {

	public static String compression1(String str){
        int pointer=0;
        String s="";
        int i = 0;
        s+=str.charAt(i);
        while(pointer<str.length()){
            if(str.charAt(i)!=str.charAt(pointer)){
                i=pointer;
                s+=str.charAt(pointer);
            }
            pointer++;
        }
		return s;
	}

	public static String compression2(String str){
		int pointer=0;
        String s="";
        int i = 0;
        s+=str.charAt(i);
        int count=0;
        while(pointer<str.length()){
            if(str.charAt(i)!=str.charAt(pointer)){
                i=pointer;
                if(count!=1){
                s+=count;
                }
                s+=str.charAt(pointer);
                count=0;
            }
            count++;
            pointer++;
        }
        if(count!=1){
                s+=count;
                }
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}