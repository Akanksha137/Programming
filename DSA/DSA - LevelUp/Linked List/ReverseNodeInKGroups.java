import java.util.*;

class ReverseNodeInKGroups {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    
  public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur.next!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        cur.next = prev;
        return cur;
    }
   
    
    public static ListNode reverseInKGroup(ListNode head, int k) {
        if(head == null || head.next == null)return head;
        
        ListNode cur = head;
        ListNode firstKth = cur;
        int i=1;
        while(i<k && cur.next!=null){
         cur = cur.next; 
         i++;
        }
        
        if(i == k ){
        ListNode secondKth = cur.next;
        cur.next = null;
        firstKth = reverse(firstKth);
        secondKth = reverseInKGroup(secondKth,k);
        cur = firstKth;
        while(cur.next!=null){
         cur = cur.next;
        }
        cur.next = secondKth;
        }
        return firstKth;
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

        int k = scn.nextInt();
        h1 = reverseInKGroup(h1, k);
        printList(h1);
    }
}