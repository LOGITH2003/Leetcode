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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode answer = null,index = null;
        int count = 0;

        while(list1 != null){
            if(count<a || b<count){
                if(answer == null){
                    ListNode newNode = new ListNode(list1.val);
                    newNode.next = answer;
                    answer = newNode;
                    index = newNode;
                }
                else{
                    ListNode newNode = new ListNode(list1.val);
                    index.next = newNode;
                    index = newNode;
                }
               
            }
            else{
                while(list2!=null){
                    if(answer == null){
                        ListNode newNode = new ListNode(list2.val);
                        newNode.next = answer;
                        answer = newNode;
                        index = newNode;
                    }
                    else{
                        ListNode newNode = new ListNode(list2.val);
                        index.next = newNode;
                        index = newNode;
                    }
                    list2 = list2.next;
                }
            }
            list1 = list1.next;
            count++;
        }       
                
        return answer;
    }
}