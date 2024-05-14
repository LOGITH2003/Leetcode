/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode container= null;
        ListNode listnode = new ListNode();
        for(ListNode cur = head; cur != null; cur = cur.next) {
            ListNode list = new ListNode(cur.val,container);
            container = list;
        }
        listnode.next = container;
        return listnode.next;
    }
}