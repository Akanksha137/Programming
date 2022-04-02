import java.util.*;
public class gcdandlcm{
	public static void main(String args[]){
		
		Scanner scn=new Scanner(System.in);
		int num1=scn.nextInt();
		int num2=scn.nextInt();
		
		int gcd=1,lcm=1;
		int temp1=num1;
		int temp2=num2;
		int temp=0;
		
		while(true){
			temp=temp1%temp2;
			
			if(temp==0){
				System.out.println(temp2);
				break;
			}
			temp1=temp2;
			temp2=temp;
		}
		
		lcm=(num1/temp2)*num2;
		System.out.println(lcm);
	}
}