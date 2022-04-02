import java.util.*;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int nC0=1,nCr=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                System.out.print(nC0 + "\t");
                nCr=(nC0*(i-j))/j;
                nC0=nCr;
            }
            System.out.println();
            nC0=1;
        }
    }
}