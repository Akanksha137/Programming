import java.io.*;
import java.util.*;

public class MultiSolver {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

    public static int size;
    public static int min;
    public static int max;
    public static int height;

    public static void muiltisolver(Node node , int depth){
        size++;
        min = Math.min(min , node.data);
        max = Math.max(max , node.data);
        height = Math.max(height , depth);

        for(Node child:node.children){
            muiltisolver(child , depth + 1);
        }
    }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n1 = Integer.parseInt(br.readLine());
    int[] arr1 = new int[n1];
    String[] values1 = br.readLine().split(" ");
    for (int i = 0; i < n1; i++) {
      arr1[i] = Integer.parseInt(values1[i]);
    }
    Node root1 = construct(arr1);
    
    size = 0;
    min = Integer.MAX_VALUE;
    max = Integer.MIN_VALUE;
    height = 0;
    muiltisolver(root1 , 0);//depth as int passing
    System.out.println("Size = " + size);
    System.out.println("Min = " + min);
    System.out.println("Max = " + max);
    System.out.println("Height = " + height);
  }

}