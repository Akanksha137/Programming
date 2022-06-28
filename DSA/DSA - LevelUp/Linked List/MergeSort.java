import java.util.*;

class MergeSort {
  public static Scanner scn = new Scanner(System.in);

  public static class ListNode {
    int val = 0;
    ListNode next = null;

    ListNode(int val) {
      this.val = val;
    }
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null || l2 == null) return l1 != null ? l1 : l2;
    ListNode c1 = l1;
    ListNode c2 = l2;
    ListNode dummy = new ListNode (-1);
    ListNode prev = dummy;
    while (c1 != null && c2 != null) {
      if (c1.val > c2.val) {
        dummy.next = c2;
        c2 = c2.next;
      }
      else {
        dummy.next = c1;
        c1 = c1.next;
      }
      dummy = dummy.next;

    }

    dummy.next = c1 != null ? c1 : c2;
    return prev.next;
  }

  public static ListNode midNode(ListNode head) {
    if (head == null || head.next==null)return head;
    ListNode slow = head;
    ListNode fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static ListNode mergeSort(ListNode head) {
    if (head.next == null )return head;
    ListNode fh = head;
    ListNode mid = midNode(head);
    ListNode sh = mid.next;
    mid.next = null;
    fh = mergeSort(fh);
    sh = mergeSort(sh);
    head = mergeTwoLists(fh, sh);
    return head;
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

    ListNode head = mergeSort(h1);
    printList(head);
  }
}