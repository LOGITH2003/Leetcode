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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
       int [][] list = new int[m][n];
        boolean [] condition  = {true, true};
        boolean [][] order = new boolean[m][n];
        int rows = n, cols = m, i = 0, j = 0,index=1;

        while(true){
            while(true)
            {
                if(head != null){
                    list[i][j] = head.val;
                head = head.next;
                }
                else{
                    list[i][j] = -1;
                }
                order[i][j] = true;
                if(condition[0])
                {
                    if(condition[1] && j <= rows - 1)
                    {
                        if(j == rows - 1 || order[i][j+1])
                        {
                            condition[0] = false;
                            condition[1] = true;
                            i++;
                        }
                        else
                        {
                            j++;
                        }
                    }
                    else
                    {
                        if(j == 0 || order[i][j-1])
                        {
                            condition[0] = false;
                            condition[1] = false;
                            i--;
                        }
                        else
                        {

                            j--;
                        }

                    }
                }
                else
                {
                    if(condition[1] && i <= cols - 1)
                    {
                        if (i == cols - 1 || order[i+1][j])
                        {
                            condition[0] = true;
                            condition[1] = false;
                            j--;
                        }
                        else
                        {
                            i++;
                        }
                    }
                    else
                    {
                        if(i == 0 || order[i-1][j])
                        {
                            condition[0] = true;
                            condition[1] = true;
                            j++;
                        }
                        else
                        {

                            i--;
                        }
                    }
                }

                if(++index == (m*n)+1)
                    return list;
            }
        }
        
    }
}