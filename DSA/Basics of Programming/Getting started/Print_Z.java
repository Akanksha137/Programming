import java.util.*;
public class Print_Z{
	public static void main(String args[]){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				
					if( i==1 || i==5 || i==6-j ){
						System.out.print("*");
						}	
					
						else{
							System.out.print(" ");
						}											
				}
				System.out.println();
			}	
			
		}		
	}	

