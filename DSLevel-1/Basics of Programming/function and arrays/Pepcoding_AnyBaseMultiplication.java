import java.util.*;

public class Pepcoding_AnyBaseMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
    int rv=0;
    int p=1;
    while(n2>0){
       int d2 =n2%10;
       n2=n2/10;

       int sprd=getProductWithSingleDigit(b,n1,d2) ;
       rv=getSum(b,rv ,sprd * p);
       p=p*10;
    }
    return rv;
 }

  public static int getProductWithSingleDigit(int b,int n1,int n2){
      int rv=0;
      int p=1;
      int c=0;
      while(n1>0 || c>0 ){
        int temp=n1%10;
        n1=n1/10;
        int d=n2*temp + c;        
        c= d/b;
        d=d % b;
        rv=rv+ d*p;
        p=p*10;
        
      }
      return rv;
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