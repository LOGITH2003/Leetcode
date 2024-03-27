class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        int start = 0, end = 0,len = nums.length,num = 1;

        while (start<len)
        {

            // condition 1 : if the end reach len it will through the array bound exception
            if(end == len){
                end = ++start;
                num = 1;
            }
            // condition 2 : given condition for the question
            else if(num * nums[end] < k)
            {
                count++;
                num *= nums[end];
                end++;
            }
            else
            {
                end = ++start;
                num = 1;
            }


        }
        return count;
    }
}