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
 import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create StringBuilder to collect digits from each linked list
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        // Collect digits from l1
        while (l1 != null) {
            s1.append(l1.val);
            l1 = l1.next;
        }

        // Collect digits from l2
        while (l2 != null) {
            s2.append(l2.val);
            l2 = l2.next;
        }

        // Convert the reversed strings to BigInteger
        BigInteger n1 = new BigInteger(s1.toString());
        BigInteger n2 = new BigInteger(s2.toString());


        System.out.println(n1+"\n"+n2);
        // Add the two numbers
        StringBuilder str = new StringBuilder(n1.add(n2).toString());

        // Initialize the result linked list
        ListNode head = null;
        ListNode index = null;

        // Create linked list from the result string
        for (char c : str.toString().toCharArray()) {
            ListNode temp = new ListNode(Character.getNumericValue(c));

            if (head == null) {
                head = temp;
            } else {
                index.next = temp;
            }

            index = temp;
        }

        return head;
    }
}