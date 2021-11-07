import java.util.*;
import java.io.*;
public class ExitPointPepcoding{
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scn.nextInt();
            }
        }

        int i=0;
        int j=0;
        int dir=0;//0 east , 1 - south , 2-west , 3-north
        while(true){
            dir=(dir +a[i][j])%4;
            if(dir==0){
                //east
                j++;

            }else if(dir==1){
                //south
                i++;
            }
            else if(dir==2){
                //west
                j--;
            }
            else if(dir==3){
                //north
                i--;
            }

            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i==a.length){
                i--;
                break;
            }
            else if(j==a[0].length){
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}