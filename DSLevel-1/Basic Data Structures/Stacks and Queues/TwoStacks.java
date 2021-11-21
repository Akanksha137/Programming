import java.io.*;
import java.util.*;

public class TwoStacks {

  public static class TwoStack {
    int[] data;
    int tos1;
    int tos2;

    public TwoStack(int cap) {
      data = new int[cap];
      tos1=0;
      tos2=0;
    }

    int size1() {
     return tos1;
    }

    int size2() {
      return tos2;
    }

    void push1(int val) {
     if(size1() + size2() == data.length){
         System.out.println("Stack overflow");
         return;
     }
     else{
         for(int i=tos1;i<tos1+tos2;i++){
             data[i+1]=data[i];             
         }
       data[tos1]=val;
       tos1++;
     }
    }

    void push2(int val) {
     if(size1() + size2() == data.length){
         System.out.println("Stack overflow");
         return;
     }
     else{
         data[tos1+tos2]=val;
         tos2++;
     }
    }

    int pop1() {
     if(size1()==0){
         System.out.println("Stack underflow");
         return -1;
     }
     else{
         int key = data[tos1-1];
        for(int i=tos1;i<size1()+size2() ;i++){
            data[i-1]=data[i];
        }
        tos1--;
        return key;
     }
    }

    int pop2() {
     if(size2()==0){
         System.out.println("Stack underflow");
         return -1;
     }
     else{
         int key = data[tos1+tos2-1];
        tos2--;
        return key;
     }
    }

    int top1() {
      if(size1()==0){
         System.out.println("Stack underflow");
         return -1;
     }
     else{
         int key = data[tos1-1];        
        return key;
     }
    }

    int top2() {
      if(size2()==0){
         System.out.println("Stack underflow");
         return -1;
     }
     else{
         int key = data[tos1+tos2-1];
        return key;
     }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    TwoStack st = new TwoStack(n);

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("push1")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push1(val);
      } else if (str.startsWith("pop1")) {
        int val = st.pop1();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top1")) {
        int val = st.top1();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size1")) {
        System.out.println(st.size1());
      } else if (str.startsWith("push2")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push2(val);
      } else if (str.startsWith("pop2")) {
        int val = st.pop2();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("top2")) {
        int val = st.top2();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size2")) {
        System.out.println(st.size2());
      }
      str = br.readLine();
    }
  }
}