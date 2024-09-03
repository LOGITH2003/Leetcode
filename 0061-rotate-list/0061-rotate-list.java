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
    public ListNode rotateRight(ListNode head, int k) {
        Queue<ListNode> queue = new LinkedList<>();

        ListNode cur = head;
        while (cur != null) {
            queue.add(cur);
            cur = cur.next;
        }

        // condition 1:
        if(queue.size() <2)
            return head;

        // condition 2:
        k = k%queue.size();
        k = queue.size() -k;
        while(k--!=0){
            queue.add(queue.poll());
        }

        ListNode index = null, start = null;
        while(!queue.isEmpty()){
            ListNode listNode = new ListNode(queue.poll().val);
            if(index == null){
                listNode.next = null;
                start = listNode;
            }
            else{
                index.next = listNode;
            }
            index = listNode;
        }
        return start;
    }
}