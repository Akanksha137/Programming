import java.io.*;
import java.util.*;

public class LargestBSTsubtree {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  static class BSTPair{
      int min;
      int max;
      boolean isBST;  
      int sum;
      int largest;
  }

  public static BSTPair isBinaryTree(Node node){
      if(node == null){
          BSTPair bt = new BSTPair();
          bt.max = Integer.MIN_VALUE;
          bt.min = Integer.MAX_VALUE;
          bt.isBST = true;
          bt.sum = 0;
          bt.largest = 0;
          return bt;
      }
      BSTPair lp = isBinaryTree(node.left);
      BSTPair rp = isBinaryTree(node.right);
      BSTPair mp = new BSTPair();
      mp.isBST = lp.isBST && rp.isBST && node.data>=lp.max && node.data<=rp.min;
      mp.max = Math.max(node.data , Math.max(lp.max, rp.max));
      mp.min = Math.min(node.data, Math.min(lp.min,rp.min));
      if(mp.isBST==true){
        mp.largest = node.data;
        mp.sum = lp.sum + rp.sum +1;
      }
      else{
        if(rp.isBST==true){
            mp.largest = node.right!=null?node.right.data:0;
            mp.sum = rp.sum;
        }
        else if(lp.isBST==true){
            mp.largest = node.left!=null?node.left.data:0;
            mp.sum = lp.sum;
        }
      }
      return mp;
  }

   public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    BSTPair res = isBinaryTree(root);
    System.out.println(res.largest +  "@"+ res.sum);
  }

}