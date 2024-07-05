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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer index = 1, value = null, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (head.next != null) {

            if(value!= null){
                if((value<head.val && head.next.val<head.val) || (value>head.val && head.next.val> head.val)){
                    list.add(index);
                    if(list.size()!=1){
                        max =  Math.max(index- list.get(0), max);
                        min = Math.min(index - list.get(list.size()-2), min);
                    }
                }
            }
            index++;
            value = head.val;
            head = head.next;

        }
        
        int [] nums = new int[2];
        nums[0] = min == Integer.MAX_VALUE ? -1 : min;
        nums[1] = max == Integer.MIN_VALUE ? -1 : max;
        return nums;
    }
}