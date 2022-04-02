import java.util.*;

public class Pattern10 {

    public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int n=scn.nextInt();
        
           int sp1=n/2,sp2=-1;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp1;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            
            for(int j=1;j<=sp2;j++){
                System.out.print("\t");
            }
            if(i>1 && i<n){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
            sp1--;
            sp2+=2;
            }
            else{
                sp1++;
                sp2-=2;
            }
        }
    }
}
    