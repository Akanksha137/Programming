import java.util.*;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int value= getValueInBase(n , sourceBase , destBase);
        System.out.println(value);
    }

    public static int getValueInBase(int n , int sourceBase ,int destBase){
       int val=AnyBaseToDecimal(n,sourceBase); 
       val=DecimalToAnyBase(val,destBase);
       return val;
    }

     public static int AnyBaseToDecimal(int n, int b) {
        int temp=0,count=0,value=0;
        while(n>0){
            temp=n%10;
            value=value + temp*(int)Math.pow(b,count);
            count++;
            n=n/10;
        }
        return value;
    }

      public static int DecimalToAnyBase(int n, int b) {
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