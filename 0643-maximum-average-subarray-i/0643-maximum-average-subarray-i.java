class Solution {
    public double findMaxAverage(int[] nums, int k) {
         double ans = Integer.MIN_VALUE;
        int len = nums.length,count = 0,start = 0,end = 0;
        while(end<len){
            count += nums[end];
            if(end >=k-1){
                double temp =(double) count/k;
                ans = Math.max(ans,temp);
                count -= nums[start++];
            }
            end++;
        }

        
        return ans;
    }
}