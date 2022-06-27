import java.util.*;

class Palindrome {
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

    public static boolean isPalindrome(ListNode head) {
        ListNode mid = midNode(head);
        ListNode reverseLL = reverse(mid.next);
        
       
        while(reverseLL!=null && head !=mid.next){
            if(reverseLL.val!= head.val){
                return false;
            }
            reverseLL = reverseLL.next;
            head = head.next;
        }
        
        return true;
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

        System.out.println(isPalindrome(dummy.next));
    }
}