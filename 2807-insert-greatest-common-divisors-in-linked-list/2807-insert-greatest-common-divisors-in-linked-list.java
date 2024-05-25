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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode answer = null;
        ListNode tail = null;
        
        // Iterate through the head ListNode until it becomes null
        while(head!=null)
        {
        
            ListNode newNode = new ListNode(head.val);
            if(answer == null){
                newNode.next = answer;
                answer = newNode;
                tail = answer;
            }
            else{
                answer.next = newNode;
                answer = newNode;
            }
            
            // Condition 1: Find the common divisor of the current head value and the next head value
            if(head.next != null)
            {
                int value = findGreatestCommonDivisor(head.val, head.next.val);
                
                ListNode newNodeVal = new ListNode(value);
                answer.next = newNodeVal;
                answer = newNodeVal;
            }            
            
            head = head.next;
        }
        
        return tail;
    }
    
    // Find the greatest common divisor (GCD)
    int findGreatestCommonDivisor(int n1, int n2){
        int val = 1;
        int min = Math.min(n1, n2);
        for(int i = 2;i<=min/2;i++){
            if(n1%i==0 && n2%i==0){
                val = Math.max(val,i);
            }
        }
        val = n1%min==0 && n2%min==0?min:val;
        return val;
    } 
}