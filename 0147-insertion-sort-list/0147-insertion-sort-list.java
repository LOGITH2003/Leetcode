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
    public ListNode insertionSortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode cur = null,tail = null;

        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        while(!list.isEmpty()) {
            if(cur == null) {
                ListNode newNode = new ListNode(list.get(0));
                newNode.next = cur;
                cur = newNode;
                tail = cur;
            }
            else{
                ListNode newNode = new ListNode(list.get(0));

                cur.next = newNode;
                cur = newNode;
            }
            list.remove(0);
        }
        return tail;
    }
}