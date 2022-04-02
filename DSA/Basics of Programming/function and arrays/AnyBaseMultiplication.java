import java.util.*;

public class AnyBaseMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
    int sum=0;//last for summing all multiplication 
    int multi=0;//for multiplication result
    int temp1=n1,temp2=n2;//temporary variable for n1 and n2
    int count1=0,count2=0;//for increasing the digits
    int carry=0;//carry for next
    int tn1=n1;//taking temporary for n1

    while(n2>0 ){    
    temp2=n2%10;
        while(tn1>0 || carry>0){
            temp1=tn1%10;
            multi+=(((temp1*temp2)+carry)%b)*(int)Math.pow(10,count1);//multiplying the digits
            count1++;//increasing the count1       
            carry=(carry+(temp1*temp2))/b;//considering carry
            tn1=tn1/10;//decrementing temporary n1
        }
        // if(carry!=0){
        //     multi+=carry*(int)Math.pow(10,count1);
        // }
        multi=multi*(int)Math.pow(10,count2);
        sum=getSum(b,sum,multi);
        multi=0;
        carry=0;
        count1=0;
        tn1=n1;
        count2++;
        n2=n2/10;//decrementing the n2
       // tn1=n1;
    }
   
    return sum;
 }

 //Addition of two numbers in anybase form
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