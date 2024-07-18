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
    public ListNode oddEvenList(ListNode head) {
        
        // condition 1:
        if(head==null)
            return head;
        
        // condition 2:
        ListNode n1 = null,index1 = null;
        ListNode n2 = null, index2 = null;
        int index = 1;
        while (head != null)
        {
            ListNode listNode = new ListNode(head.val);
            if(index % 2 == 0){
                if(n1 == null)
                {
                    listNode.next = n1;
                    n1 = listNode;
                    index1 = listNode;
                }
                else
                {
                    index1.next = listNode;
                    index1 = listNode;
                }
            }
            else{
                if(n2 == null)
                {
                    listNode.next = n2;
                    n2 = listNode;
                    index2 = listNode;
                }
                else
                {
                    index2.next = listNode;
                    index2 = listNode;
                }
            }

            index++;
            head = head.next;
        }
        index2.next = n1;
        return  n2;
    }
}