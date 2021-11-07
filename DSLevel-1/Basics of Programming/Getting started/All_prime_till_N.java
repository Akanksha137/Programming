import java.util.*;
public class All_prime_till_N{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		//input lower range
		int low=scn.nextInt();
		//input higher range
		int high=scn.nextInt();
		for(int i=low;i<=high;i++){
			int count=0;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count==0){
				System.out.println(i);
			}
		}
		
	}
}