import java.util.*;

class RemoveNodeFromEnd {
  public static Scanner scn = new Scanner(System.in);

  public static class ListNode {
    int val = 0;
    ListNode next = null;

    ListNode(int val) {
      this.val = val;
    }
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
  
    int i = 1;
    ListNode fast = head;
    ListNode slow = new ListNode(-1);
    ListNode res = slow;
    slow.next = head;

    while(i<n){
        fast = fast.next;
        i++;
    }
   
   
    while(fast.next!=null){
        slow = slow.next;
        fast = fast.next;
    }
  
    slow.next = slow.next !=null ? slow.next.next : null;
    return res.next;
  }

  public static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.val + " ");
      node = node.next;
    }
  }

  public static ListNode createList(int n) {
    ListNode dummy = new ListNode(-1);
    ListNode prev = dummy;
    while (n-- > 0) {
      prev.next = new ListNode(scn.nextInt());
      prev = prev.next;
    }

    return dummy.next;
  }

  public static void main(String[] args) {
    int n = scn.nextInt();
    ListNode h1 = createList(n);

    int m = scn.nextInt();
    h1 = removeNthFromEnd(h1, m);
    printList(h1);
  }
}