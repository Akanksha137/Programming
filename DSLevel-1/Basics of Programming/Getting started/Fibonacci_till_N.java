import java.util.*;
public class Fibonacci_till_N{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int fib1=0;
		int fib2=1;
		int fib,count=0;		
		while(count<n){
			 if(count==0){
				System.out.println(fib1);
			}
			else if(count==1){
				System.out.println(fib2);
			}
			else{
			fib=fib1+fib2;
			System.out.println(fib);
			fib1=fib2;
			fib2=fib;			
			}
			count++;
		}
		
	}
}