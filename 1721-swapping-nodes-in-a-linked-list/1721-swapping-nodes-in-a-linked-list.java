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
    public ListNode swapNodes(ListNode head, int k) {
        
        ArrayList<Integer> list = new ArrayList<>();

        while(head!=null){
            list.add(head.val);
            head = head.next;
        }

        int val = list.get(k-1);
        list.set(k-1, list.get(list.size()-k));
        list.set(list.size()-k,val);


        ListNode index = null, tail = null;

        while(!list.isEmpty()){

            ListNode newNode = new ListNode(list.get(0));

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