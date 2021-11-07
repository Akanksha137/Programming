import java.util.*;
  
  public class AnyBaseSubtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
      int diff=0,borr=0,temp1=n1,temp2=n2,count=0;
      while(n1>0 || n2>0){
          temp1=n1%10;
          temp2=n2%10;
          if(temp2<(temp1-borr)){
          diff+=(temp2+b-temp1+borr)*(int)Math.pow(10,count);
          borr=-1;
          }
          else{
              diff+=(temp2-temp1+borr)*(int)Math.pow(10,count);
              borr=0;
          }          
          count++;
            n1=n1/10;
            n2=n2/10;
      }
      return diff;
   }
  
  }