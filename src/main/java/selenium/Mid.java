package selenium;
//import crio.ds.List.ListNode;

public class Mid {

      if(head == null || head.next == null) {
        return head;
    }
    ListNode fast = head;
    ListNode slow = head;
    ListNode prevOfSlow = null;
            while(fast != null && fast.next != null) {
        prevOfSlow = slow;
        fast = fast.next.next;
        slow = slow.next;
    }

    prevOfSlow.next = slow.next;
    slow.next = head;

            return slow;
}
