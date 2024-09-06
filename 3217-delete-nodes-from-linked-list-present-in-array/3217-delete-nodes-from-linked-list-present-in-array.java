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
    public ListNode modifiedList(int[] nums, ListNode head) {

        Arrays.sort(nums);

        ListNode position = null, index = position;

        while(head!= null) {

            if(!itsContains(nums,head.val))
            {
                ListNode listNode = new ListNode(head.val);

                if(position == null){
                    listNode.next = position;
                    position = listNode;
                    index = listNode;

                }
                else{
                    index.next = listNode;
                    index = listNode;
                }
            }

            head = head.next;
        }

        return position;
    }
    protected boolean itsContains(int[] nums, int val) {

        int start = 0, end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == val) {
                return true;
            }
            else if (nums[mid] < val) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}