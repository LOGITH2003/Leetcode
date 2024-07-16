class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int beforeZero = 0, afterZero = 0;
        boolean zeroFound = false;
        
        for(int num : nums)
        {
            if(num==0)
            {
                max = Math.max(max, beforeZero+afterZero);
                beforeZero = afterZero;
                afterZero = 0;
                zeroFound = true;
            }
            else
                afterZero++;
        }

        return zeroFound?Math.max(max, beforeZero+afterZero):Math.max(max, beforeZero+afterZero)-1;
    }
}