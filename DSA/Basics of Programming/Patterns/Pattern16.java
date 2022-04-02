import java.util.*;
public class Pattern16{
    public static void main(String [] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int sp=(2*(n-1)-1);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"\t");
            }

            for(int j=0;j<sp;j++)
            {
                System.out.print("\t");
            }

            for(int j=i;j>0;j--)
            {
                if(j==n){
                    j--;
                }
                System.out.print(j+"\t");
            }
            System.out.println();
            sp-=2;
        }
    }
}