import java.io.*;
import java.util.*;

public class PostFixEvaluationAndConversions{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer> operand = new Stack<>();
   // Stack<Character> operator = new Stack<>();
    for(int  i=0;i<exp.length();i++){
        char ch = exp.charAt(i);
        if(Character.isDigit(ch)){
            operand.push(ch-'0');
        }
        else{
            int v2 = operand.pop();
            int v1 = operand.pop();
            int k = operation(v1,v2,ch);
            operand.push(k);
        }
    }
    System.out.println(operand.peek());
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