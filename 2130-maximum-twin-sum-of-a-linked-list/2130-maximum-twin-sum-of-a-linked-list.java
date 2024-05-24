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
    public int pairSum(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int [] arr = new int[count/2];
       
        int index = 0,max = 0;
        boolean set = true;
        while(head!=null){
             if(index == count/2){
                 set = false;
                 index--;
             }
            arr[index] += head.val;
            max = Math.max(max,arr[index]);
            head = head.next;
            index = set?index+1:index-1;
        }
        return max;
    }
}