import java.io.*;
import java.util.*;

public class InfixConversion{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    
    Stack<String>postfix = new Stack<>();
    Stack<Character>operators = new Stack<>();
    for(int i=0;i<exp.length();i++){
        char ch = exp.charAt(i);
        if(ch == ')'){
            // while(operators.size()>0 && operators.peek()!='('){
            //     String v2 = postfix.pop();
            //     String v1 = postfix.pop();
            //     char c = operators.pop();
            //     String str = v2 + v1 +ch;
            //     postfix.push(str);
            // }
            //postfix.pop();
        }
        else if(ch =='('){
           //operators.push(ch); 
        }
        
        else if(ch == '+' || ch == '-' || ch== '*' || ch == '/'){
            // while(postfix.size()>0 && operators.size()>0 && preferences(ch)<= preferences(operators.peek())){
            //     String pv2 = postfix.pop();
            //     String pv1 = postfix.pop();
            //     String str =  pv1 + pv2 + ch;
            //     postfix.push(str);
            // }

            while(postfix.size()>1){
                String pv2 = postfix.pop();
                String pv1 = postfix.pop();
                String str =  pv1 + pv2 + ch;
                postfix.push(str);
            }
        }
        else{
            postfix.push(ch+"");
        }
    }
    System.out.println(postfix);
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