import java.util.*;
public class Grading_system{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);//initializing for input
		int n=scn.nextInt();//taking input from user
		if(n>90){
			System.out.println("excellent");
		}
		else if(n>80 && n<=90){
			System.out.println("good");
		}
		else if(n>70 && n<=80){
			System.out.println("fair");
		}
		else if(n>60 && n<=70){
			System.out.println("meets expectations");
		}
		else if(n<=60){
			System.out.println("par");
		}
	}
}
