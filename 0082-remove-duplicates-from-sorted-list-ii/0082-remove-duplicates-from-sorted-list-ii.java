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
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode cur = head;
        while (cur != null) {
            map.put(cur.val, map.getOrDefault(cur.val, 0) + 1);
            cur = cur.next;
        }
        
        ListNode list = null,index = null;
        
        while (head != null) {
            if (map.containsKey(head.val) && map.get(head.val) == 1) {
                ListNode listNode = new ListNode(head.val);
                if(list == null)
                {
                    listNode.next = list;
                    list = listNode;
                }
                else{
                    index.next = listNode;
                }
                index = listNode;
            }
            head = head.next;
        }
        
        
        return list;
    }
}