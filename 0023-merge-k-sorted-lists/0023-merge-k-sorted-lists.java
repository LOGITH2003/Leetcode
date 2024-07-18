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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0)
            return null;

        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode n : lists){
            while(n!=null)
            {
                list.add(n.val);
                n = n.next;    
            }
        }
        Collections.sort(list);
        return listToListNodeConverter(list);
    }
    
    private ListNode listToListNodeConverter(ArrayList<Integer> list)
    {
        ListNode index = null,head = null;
        for(int n : list)
        {
            ListNode listNode = new ListNode(n);
            if(head == null)
            {
                listNode.next = null;
                head = listNode;
                index = listNode;
            }
            else
            {
                index.next = listNode;
                index = listNode;
            }
        }
        return head;
    }
}