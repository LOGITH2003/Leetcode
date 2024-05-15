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
    public int getDecimalValue(ListNode head) {
        // create the temperary ListNode to store the head object address
        ListNode temp = head;

        // create the string to store the Binary integer value
        String word = "";

        // iterate the list node
        while(temp!=null){
            word += String.valueOf(temp.val);
            temp = temp.next;
        }

        // return convert the word to integer and convert the base 2 to base 10 and again convert into Integer 
        return  Integer.valueOf(Integer.toString(Integer.parseInt(word, 2), 10));
    
    }
}