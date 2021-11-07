import java.util.*;

public class AnyBaseToDecimal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int temp=0,count=0,value=0;
        while(n>0){
            temp=n%10;
            value=value + temp*(int)Math.pow(b,count);
            count++;
            n=n/10;
        }
        return value;
    }
}