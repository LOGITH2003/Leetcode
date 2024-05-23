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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode AnsNode = null,ans = null;
        while(head!=null){
            if(AnsNode== null){
                 ListNode newNode = new ListNode(head.val);
                newNode.next = AnsNode;
                AnsNode = newNode;
                ans = AnsNode;
            }
            else{
                if(head.val !=AnsNode.val){
                 ListNode newNode = new ListNode(head.val);
                    AnsNode.next = newNode;
                    AnsNode = newNode;
                }
            }
            head = head.next;
        }
        return ans;
    }
}