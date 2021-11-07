import java.util.*;
import java.io.*;
public class FindElementOfanArray{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int search=scn.nextInt();
        int  pos=-1;
        for(int i=0;i<n;i++){
            if(search==arr[i])
            {
               pos=i;
                break;
            }
        }
        System.out.println(pos);
    }
}