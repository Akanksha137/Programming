import java.io.*;
import java.util.*;

public class PostFixEvaluationAndConversions{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> operand = new Stack<>();
   // Stack<Character> operator = new Stack<>();
   Stack<String>infix = new Stack<>();
   Stack<String>prefix = new Stack<>();
    for(int  i=0;i<exp.length();i++){
        char ch = exp.charAt(i);
        if(Character.isDigit(ch)){
            operand.push(ch-'0');
            infix.push(String.valueOf(ch-'0'));
            prefix.push(String.valueOf(ch-'0'));
        }
        else{
            int v2 = operand.pop();
            int v1 = operand.pop();
            int k = operation(v1,v2,ch);
            operand.push(k);
            String s2 = infix.pop();
            String s1 = infix.pop();
            String str = "("+ s1 + ch +s2 +")";
            infix.push(str);

            String ps2 = prefix.pop();
            String ps1 = prefix.pop();
            String pstr =ch + ps1 + ps2;
            prefix.push(pstr);
        }
    }
    System.out.println(operand.peek());
    System.out.println(infix.peek());
    System.out.println(prefix.peek());
 }
 public static int operation(int v1 , int v2 ,char ch){
     if(ch == '+'){
         return v1+v2;
     }
     else if(ch =='-'){
         return v1-v2;
     }
     else if(ch == '*'){
         return v1*v2;
     }
     else{
         return v1/v2;
     }
 }
}