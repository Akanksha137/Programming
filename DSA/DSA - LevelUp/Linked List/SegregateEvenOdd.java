import java.util.*;

class SegregateEvenOdd {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode segregateEvenOdd(ListNode head) {
        
        ListNode even = new ListNode(-1);
        ListNode evenHead = even;
        ListNode odd = new ListNode(-1);
        ListNode oddHead = odd;
        ListNode cur = head;
        while(cur!=null){
            if(cur.val %2==0){
                even.next = cur;
                even = even.next;
            }
            else{
                odd.next = cur;
                odd = odd.next;
            }
            cur = cur.next;
        }
        even.next = oddHead.next;
        odd.next = null;
        return evenHead.next;
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

        ListNode head = segregateEvenOdd(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}