import java.util.*;

class UnFoldLinkedList {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    
    public static void unfold(ListNode head) {
    
    // ListNode even = new ListNode(-1);
    // ListNode odd = new ListNode(-1);
    // ListNode evenStart = even;
    // ListNode oddStart = odd;
    // boolean isEven = true;
    // while(head!=null){
    //     if(isEven == true){
    //         even.next = head;
    //         even = even.next;
    //         isEven = false;
    //     }
    //     else{
    //         odd.next = head;
    //         odd = odd.next;
    //         isEven = true;
    //     }
    //     head = head.next;
    // }

    // odd.next = null;
    // even.next = null;

    // ListNode reverseLL =reverse(oddStart.next);
    // head = evenStart.next;
    // even.next = reverseLL;



    // Optimisation

    //first
    ListNode fh = head;
    ListNode fp = fh;
    
    //second
    ListNode sh = head.next;
    ListNode sp = sh;
    
    while(sp !=null && sp.next!=null){
        //backup
        ListNode f = sp.next;

        //links
        fp.next = f;
        sp.next = f.next;
        
        //move
        fp = fp.next;
        sp = sp.next;
    }

    fp.next = null;
    sh = reverse(sh);
    fp.next = sh;

    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
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
        unfold(head);
        printList(head);
    }
}