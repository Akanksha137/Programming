import java.util.*;

public class DecimalToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        int temp=0,value=0,count=0;
        while(n>0){
            temp=n%b;
            value=value+ temp * (int)Math.pow(10,count);
            count++;
            n=n/b;
        }
        return value;
    }
}