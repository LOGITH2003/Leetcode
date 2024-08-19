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
    public ListNode partition(ListNode head, int x) {
        
        ArrayList<Integer> lesserThan = new ArrayList<>();
        ArrayList<Integer> greaterThan = new ArrayList<>();

        while(head!=null)
        {
            if(head.val <x)
                lesserThan.add(head.val);
            else
                greaterThan.add(head.val);
            
            head = head.next;
        }

        ListNode index = null; head = index;

        while(!lesserThan.isEmpty())
        {
            ListNode newList = new ListNode(lesserThan.get(0));
            if(head == null)
            {
                newList.next = head;
                head = newList;
            }
            else
            {
                index.next = newList;
            }
            index = newList;
            lesserThan.remove(0);
        }
        while(!greaterThan.isEmpty())
        {
            ListNode newList = new ListNode(greaterThan.get(0));
            if(head == null)
            {
                newList.next = head;
                head = newList;
            }
            else
            {
                index.next = newList;
            }
            index = newList;
            greaterThan.remove(0);
        }
        
        return head;
    }
}