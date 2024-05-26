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
    public ListNode mergeNodes(ListNode head) {
        ListNode index = null, ans = null;
        int count = 0;
        while(head!=null){
            if(count !=0 && head.val ==0){
                ListNode newNode = new ListNode(count);
                if(ans==null){                    
                    newNode.next = ans;
                    index = newNode;
                    ans = index;
                }
                else{
                    index.next = newNode;
                    index = newNode;
                }
                count = 0;
            }
            else{
                count += head.val;
            }
            head = head.next;
        }
        return ans;
    }
}