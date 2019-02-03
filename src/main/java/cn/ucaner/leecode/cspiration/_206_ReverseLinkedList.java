package cn.ucaner.leecode.cspiration;

public class _206_ReverseLinkedList {
    /**
     * 206. Reverse Linked List

     time : O(n);
     space : O(1);

     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}
