import java.util.*;
public class Digit_of_a_number{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int temp=n;
		int count=0;
		while(temp>0){
			count++;
			temp=temp/10;
		}
		temp=n;
		while(count>0){
			int x=temp/(int)Math.pow(10,count-1);
			System.out.println(x%10);
			temp=n;
			count--;
		}
	}
}