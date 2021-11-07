import java.util.*;
public class Inverse_of_a_number{
	public static void main(String [] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int count=0,temp=n;
		temp=0;
		int i=1;
		while(n>0){
			int rem=n%10;
			temp = temp + i*(int)Math.pow(10,rem-1);			
			n=n/10;				
			i++;			
		}
		System.out.println(temp);
	}
}