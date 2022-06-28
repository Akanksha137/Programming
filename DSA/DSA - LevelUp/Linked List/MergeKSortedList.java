
import java.util.*;

class MergeKSortedList {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null || l2==null) return l1!=null ? l1:l2;
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode dummy = new ListNode (-1);
        ListNode prev = dummy;
        while(c1!=null && c2!=null){
            if(c1.val>c2.val){
                dummy.next = c2;
                c2 = c2.next;
            }
            else{
                dummy.next = c1;
                c1 = c1.next;
            }
            dummy = dummy.next;
            
        }
        
        dummy.next = c1!=null ? c1:c2;
        return prev.next;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        for(int i = 0 ; i < lists.length;i++){
            dummy.next = mergeTwoLists(dummy.next,lists[i]);
        }
        return prev.next;
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
        ListNode[] list = new ListNode[n];
        for (int i = 0; i < n; i++) {
            int m = scn.nextInt();
            list[i] = createList(m);
        }

        ListNode head = mergeKLists(list);
        printList(head);
    }
}