import java.util.*;

class FoldLinkedList {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode midNode(ListNode head) {
        if(head == null)return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
    public static void fold(ListNode head) {
        ListNode mid = midNode(head);
        ListNode reverseMid = reverse(mid.next);
        mid.next = null;
        ListNode c1 = head;
        ListNode c2 = reverseMid;
        while(c2!=null){
            ListNode c1next = c1.next;
            ListNode c2next = c2.next;
            
            c1.next = c2;
            c2.next = c1next;
            
            c1=c1next;
            c2=c2next;
        }
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        fold(head);
        printList(head);
    }
}