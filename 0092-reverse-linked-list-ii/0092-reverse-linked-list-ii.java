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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        while (left < right) {
            int temp = list.get(left - 1);
            list.set(left - 1, list.get(right - 1));
            list.set(right - 1, temp);
            left++;
            right--;
        }

        ListNode index = head;

        for(int ls : list)
        {
            ListNode listNode = new ListNode(ls);
            if(head == null)
            {
                listNode.next = head;
                head = listNode;
            }
            else
            {
                index.next = listNode;
            }
            index = listNode;
        }


        return head;
    }
}