//This part program is wrong because here asked to give all prime numbers which is divisible by the number n.


/* 
import java.util.*;
	public class
		 primeFactorisation{ public
		static void
		main(String args[]){
		Scanner scn=new
			Scanner(System.in); int
			n=scn.nextInt(); int
			    i=2; while(n!=1){
				i=2; while(i<=n){
		    	if(n%i==0){ n=n/i;
				System.out.print(i+" ")
				; break;
				} i++;
				
			}
		}
	}
} */

//This is correct one.

import java.util.*;

public class primeFactorisation{

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int div=2;div*div<=n;div++){
		    while(n%div==0){
		        n=n/div;
		        System.out.print(div+" ");
		        
		    }
		}
		if(n!=1){
		    System.out.print(n);
		}
    }
}