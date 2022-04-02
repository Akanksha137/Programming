import java.util.*;

public class AnyBaseAddition {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {
        int c=0,temp1=0,temp2=0,sum=0,count=0;
        while(n1>0 || n2>0){
            temp1=n1%10;
            temp2=n2%10;
            sum=sum+ ((temp1+temp2+c)%b)*(int)Math.pow(10,count);
            count++;
            c=((temp1+temp2+c)/b);
            n1=n1/10;
            n2=n2/10;
             }
             if(c!=0){
              sum=sum+ (c)*(int)Math.pow(10,count);   
             }
        return sum;
    }
}