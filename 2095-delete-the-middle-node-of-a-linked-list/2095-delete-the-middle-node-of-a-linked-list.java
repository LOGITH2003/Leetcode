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
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        
        // iterate the listnode to get the size of the listnode
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        
        count/=2;
        
        ListNode ans = null, set = null;
        while(head!=null){
            
            if(count != 0){
                ListNode newNode = new ListNode(head.val);
                if(ans==null){
                    newNode.next = ans;
                    ans = newNode;
                    set = ans;
                }
                else{
                    ans.next = newNode;
                    ans = newNode;
                }
                
            }
            head = head.next;
            count--;
        }
        return set;
    }
}