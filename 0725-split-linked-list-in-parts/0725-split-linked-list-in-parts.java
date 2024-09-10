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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode [] list = new ListNode[k];

        // To store the length of the head
        int len = 0;

        // To find the head length
        ListNode tempVar = head;
        while(tempVar!=null){
            len++;
            tempVar = tempVar.next;
        }

        int constantValue = len/k, remainingValue = len%k, index = 0;

        while(head != null){

            ListNode value = head, pointer = head;

            // Create a part of constantValue size, adjust for remainingValue if needed
            for (int i = 0; i < constantValue + (remainingValue > 0 ? 1 : 0) - 1; i++) {
                if (pointer != null) {
                    pointer = pointer.next;
                }
            }

            if (pointer != null) {
                ListNode nextPart = pointer.next;
                pointer.next = null;
                head = nextPart;
            }

            list[index++] = value;

            if (remainingValue > 0)
                remainingValue --;
        }
        
        return list;
    }
}