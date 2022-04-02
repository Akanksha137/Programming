import java.io.*;
import java.util.*;

public class PermutationsOfString {

	public static void solution(String str){
		int factorial=1;
        int length=str.length();
        while(length>1){
            factorial=factorial *  length;
            length--;
        }
        for(int i=0;i< factorial ; i++){
            StringBuilder sb = new StringBuilder(str);
            int temp=i;
            for(int j=str.length();j>=1;j--){
                int q=temp/j;
                int r = temp %j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }
            System.out.println();
        }
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}