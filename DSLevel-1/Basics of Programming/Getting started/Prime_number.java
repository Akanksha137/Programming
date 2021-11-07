import java.util.*;
public class Prime_number{
	public static void main(String [] args){
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		
		for(int i=1;i<=t;i++){
			int count=0;
			int n=scn.nextInt();
			for(int j=2;j<=Math.sqrt(n);j++){
				if(n%j==0){
					count++;
					break;
				}
			}
				if(count==0 || n==2 || n==3 ){
					System.out.println("prime");
				}
				else{
					System.out.println("not prime");
				}
			
		}
	}
}