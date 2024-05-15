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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        
        //create the new ListNode to store the head address
        ListNode node = head;
        
        // iterate the new ListNode until it reach the number and count the iteration
        while(node!=null){
            count++;
            node = node.next;
        }
        // create the temporary integer variable to store the half of the count value and if is add integer and increase the value in temp value
        int temp = count%2==0?count/2: (count/2)+1;
        while(head!=null){
            if(count == temp)
                return head;
            count--;
            head = head.next;
        }
        return node;
    }
}