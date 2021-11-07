import java.util.*;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n/2,st=1;//sp is for space and st for star
        for(int i=0;i<=n/2;i++){
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            sp--;
            for(int j=0;j<st;j++){
                System.out.print("*\t");
            }
            st+=2;
            System.out.println();
        }
        sp++;
        st-=2;
        for(int i=(n/2)+1;i<n;i++){
            sp++;
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            st-=2;
            for(int j=0;j<st;j++){
                System.out.print("*\t");
            }
            
            System.out.println();
        }
        
    }
}