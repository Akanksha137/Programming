/* import java.util.*;
public class PythagoreanTriplet{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int temp=0;
		if(a>b && a>c){
		temp=b*b + c*c;
		if(a*a==temp){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		}
		else if(b>c && b>a){
		temp=a*a + c*c;
		if(b*b==temp){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}	
		}
		else if(c>a && c>b){
		temp=b*b + a*a;
		if(c*c==temp){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}	
		}
		else{
			System.out.println("false");
		}
	}
}
 */

//Alternate way or pepcoding way

import java.util.*;
public class PythagoreanTriplet{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		
		int max=a;
		if(b>=max){
			max=b;
			
		}
		if(c>=max){
			max=c;
		}
		
		
		if(max==a){
			boolean flag=(b*b + c*c)==(a*a);
			System.out.println(flag);
		}
		else if(max==b){
			boolean flag=(a*a + c*c)==(b*b);
			System.out.println(flag);
		}
		else{
			boolean flag=(b*b + a*a)==(c*c);
			System.out.println(flag);
		}
		
	}
}
