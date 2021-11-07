import java.io.*;
import java.util.*;

public class BalancedBrackets {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();
    Stack<Character>st = new Stack<>();
    boolean flag= true;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == ')' || ch == '}' || ch == ']') {
         if(ch==')'){
             if(st.size()==0){
                 flag=false;
                 break;
             }
             else if(st.peek()!='('){
                 flag=false;
                 break;
             }
                st.pop();
            }
        else if(ch=='}'){ 
            if(st.size()==0){
                 flag=false;
                 break;
             }
             else if(st.peek()!='{' ){
                 flag=false;
                 break;
             }
            st.pop();
        }
        else if(ch==']' ){
             if(st.size()==0){
                 flag=false;
                 break;
             }
             else if(st.peek()!='[' ){
                 flag=false;
                 break;
             }
           st.pop();
        }
      }
      else if(ch=='(' || ch=='{' || ch=='['){
        st.push(ch);
      }
    }
    if(st.size()>0){
        flag=false;
    }
    System.out.println(flag);
  }

}