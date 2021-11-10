import java.io.*;
import java.util.*;

public class PrefixEvaluationAndConversion{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> operand = new Stack<>();
    Stack<String> infix = new Stack<>();
    Stack<String> postfix = new Stack<>();
    for(int i=exp.length()-1;i>=0;i--){
        char ch = exp.charAt(i);
        if(Character.isDigit(ch)){
            operand.push(ch-'0');
            infix.push(ch+"");
            postfix.push(ch+"");
        }
        else{
            int v1 = operand.pop();
            int v2 = operand.pop();
            int k = operation(v1 , v2 , ch);
            operand.push(k);

            String is1 = infix.pop();
            String is2 = infix.pop();
            String is = "(" + is1 + ch+ is2 + ")";
            infix.push(is);

            String ps1 = postfix.pop();
            String ps2 = postfix.pop();
            String ps = ps1 + ps2 +ch;
            postfix.push(ps);
        }
    }
    System.out.println(operand.peek());
    System.out.println(infix.peek());
    System.out.println(postfix.peek());
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