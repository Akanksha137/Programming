import java.util.*;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int sp=(n+1)/2,st=-1;
        int count=0;
        for(int i=0;i<n;i++){
          if(i<=(n)/2){
            sp--;
            st+=2;
            count=i+1;
        }
        else{
            sp++;
            st-=2;
            count=n-i;
            
        }
            for(int j=0;j<sp;j++){
                System.out.print("\t");
            }
            
            for(int j=1;j<=st;j++){
                System.out.print(count+"\t");
                if(j<=st/2){
                    count++;
                }
                else{
                    count--;
                }
                
            }
            
           
        System.out.println();
        }
       
    }
}