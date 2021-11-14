import java.io.*;
import java.util.*;

public class InfixConversion{
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<String>postfix = new Stack<>();
    Stack<String>prefix = new Stack<>();
    Stack<Character>operators = new Stack<>();
    for(int i=0;i<exp.length();i++){
        char ch = exp.charAt(i);
        if(ch == ')'){
            while(operators.size()>0 && operators.peek()!='('){
                String pv2 = postfix.pop();
                String pv1 = postfix.pop();
                char c = operators.pop();
                String str =  pv1 + pv2 + c;
                postfix.push(str);
                String prev2 = prefix.pop();
                String prev1 = prefix.pop();
                String prestr = c + prev1 + prev2 ;
                prefix.push(prestr);
            }
            operators.pop();
        }
        else if(ch =='('){
          operators.push(ch);
        }
        
        else if(ch == '+' || ch == '-' || ch== '*' || ch == '/'){
            while(operators.size()>0 && preferences(ch)<=preferences(operators.peek()) &&  operators.peek()!='('){
                String pv2 = postfix.pop();
                String pv1 = postfix.pop();
                char c= operators.pop();
                String str =  pv1 + pv2 + c;
                postfix.push(str);
                String prev2 = prefix.pop();
                String prev1 = prefix.pop();
                String prestr = c + prev1 + prev2 ;
                prefix.push(prestr);
            }
            operators.push(ch);
        }
        else{
            postfix.push(ch+"");
            prefix.push(ch+"");
        }
    }
     while(operators.size()>0){
                String pv2 = postfix.pop();
                String pv1 = postfix.pop();
                char c = operators.pop();
                String str =  pv1 + pv2 + c;
                postfix.push(str);
                 String prev2 = prefix.pop();
                String prev1 = prefix.pop();
                String prestr = c + prev1 + prev2 ;
                prefix.push(prestr);
            }
    
    System.out.println(postfix.peek());
     System.out.println(prefix.peek());
 }

 public static int preferences(char ch){
     if(ch == '+'){
         return 1;
     }
     else  if(ch == '-'){
         return 1;
     }else  if(ch == '*'){
         return 2;
     }else{
         return 2;
     }
 }
}
