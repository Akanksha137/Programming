import java.util.*;
public class Rotate_a_number{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		int count=0;
		int temp=n;
		while(temp>0){
			count++;
			temp=temp/10;
		}
		k=k%count;
		if(k<0){
			k=count+k;
		}
		int temp2;
		temp=n/(int)Math.pow(10,k);
		temp2=n%(int)Math.pow(10,k);
		n=temp + temp2*(int)Math.pow(10,count-k);
		System.out.println(n);
	}
}
//562984
//2
//845629