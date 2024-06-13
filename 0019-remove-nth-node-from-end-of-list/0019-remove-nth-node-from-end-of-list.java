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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        list.remove(list.size()-n);
        
        ListNode tail = null, index = null;
        while(!list.isEmpty()){
            ListNode newNode  = new ListNode(list.get(0));
            if(tail == null){
                tail = newNode;
                newNode.next = index;
                index = newNode;
            }
            else{
                index.next = newNode;
                index = newNode;
            }
            list.remove(0);
        }
        return tail;
    }
}