import java.io.*;
import java.util.*;

public class InfixEvaluation{
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer>opnd = new Stack<>();
    Stack<Character>operts = new Stack<>();
    for(int i=0;i<exp.length();i++){
        char ch = exp.charAt(i);
        if(ch == '('){
            operts.push(ch);
        }
        else if(ch==')'){
         while(operts.size()>0 && operts.peek()!='('){
             int v2 = opnd.pop();
             int v1 = opnd.pop();
             char c = operts.pop();
             int k = operator(v1 , v2 , c);
             opnd.push(k);
             
         }   
         operts.pop();
        }
        else if(Character.isDigit(ch)){
           opnd.push(ch-'0'); 
        }
        else if(ch == '+' || ch == '-' || ch == '*' || ch=='/'){
            
            while(operts.size()>0 && operts.peek()!='(' && prefernces(ch)<= prefernces(operts.peek())){
             int v2 = opnd.pop();
             int v1 = opnd.pop();
             char c = operts.pop();
             int k = operator(v1 , v2 , c);
             opnd.push(k);
         }  
         operts.push(ch);         
        }
    }
    while(operts.size()>0){
             int v2 = opnd.pop();
             int v1 = opnd.pop();
             char c = operts.pop();
             int k = operator(v1 , v2 , c);
             opnd.push(k);
             
         }  
         System.out.println(opnd.peek());
 }
 public static int prefernces(char ch){
    if(ch == '+'){
        return 1;
    }   
    else if(ch == '-'){
     return 1;   
    }
    else if(ch == '*'){
     return 2;   
    }
    else {
        return 2;
    }
 }
 public static int operator(int v1,int v2 , char ch){
      if(ch == '+'){
        return v1+v2;
    }   
    else if(ch == '-'){
     return v1-v2;   
    }
    else if(ch == '*'){
     return v1*v2;   
    }
    else {
        return v1/v2;
    }
 }
}