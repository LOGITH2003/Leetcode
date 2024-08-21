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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null)
        {
            if(stack.isEmpty())
            {
                stack.push(head.val);
            }
            else
            {
                while(!stack.isEmpty() && stack.peek()<head.val)
                    stack.pop();
                stack.push(head.val);
            }
            head = head.next;
        }
        ListNode index = null;

        for(int n : stack)
        {
            ListNode listnode = new ListNode(n);
            if(head == null)
            {
                listnode.next = head;
                head = listnode;
            }
            else
            {
                index.next = listnode;
            }
            index = listnode;
        }
        return head;
    }
}