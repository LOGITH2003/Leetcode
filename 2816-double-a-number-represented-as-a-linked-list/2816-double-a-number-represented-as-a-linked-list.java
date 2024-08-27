import java.math.BigInteger;


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
    public ListNode doubleIt(ListNode head) {
        if (head.val == 0 && head.next == null) {
        return head;
    }

    // Initialize a BigInteger to store the number
    BigInteger num = BigInteger.ZERO;
    while (head != null) {
        // Multiply the current number by 10 and add the current node's value
        num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(head.val));
        head = head.next;
    }

    // Multiply the number by 2
    num = num.multiply(BigInteger.TWO);

    // Handle the case when the number is 0
    if (num.equals(BigInteger.ZERO)) {
        return new ListNode(0);
    }

    ListNode newHead = null;
    while (num.compareTo(BigInteger.ZERO) > 0) {
        // Extract the last digit from the number
        ListNode listNode = new ListNode(num.mod(BigInteger.TEN).intValue());

        // Insert the new node at the beginning of the list
        listNode.next = newHead;
        newHead = listNode;

        // Remove the last digit from the number
        num = num.divide(BigInteger.TEN);
    }

    return newHead;
    }
}