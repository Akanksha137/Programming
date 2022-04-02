import java.util.*;
public class Reverse_of_a_number{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int temp;
		while(n>0){
			temp=n%10;
			System.out.println(temp);
			n=n/10;
		}
	}
}