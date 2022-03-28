import java.io.*;
import java.util.*;

public class medianPriority {

  public static class MedianPriorityQueue {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianPriorityQueue() {
      left = new PriorityQueue<>(Collections.reverseOrder());
      right = new PriorityQueue<>();
    }

    public void add(int val) {
      if(size()%2 == 0){
         if(left.size() == 0){
             left.add(val);
         }
         else{ 
           right.add(val);
             if(right.size()>0){
                 left.add(right.remove());
             }
            
         }
      }
      else{
          right.add(val);
          if(right.peek()<left.peek()){
            int tepval = right.remove();
            right.add(left.remove());
            left.add(tepval);
          }
      }
    }

    public int remove() {
      if(size() > 0){
        if(size()%2 == 0){
          int val = left.remove();
          if(right.size()>0){
              left.add(right.remove());
          }
          return val;
         }
         else{
             if(left.size()>0)
           return left.remove(); 
           else{
               if(right.size()>0 && left.size() == 0){
                   left.add(right.remove());
               }
           }
         }
        }
      System.out.println("Underflow");
      return -1;
     

    }

    public int peek() {
     if(left.size()>0){
         return left.peek();
     }
     System.out.println("Underflow");
     return -1;
    }

    public int size() {
      return left.size()+right.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MedianPriorityQueue qu = new MedianPriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}