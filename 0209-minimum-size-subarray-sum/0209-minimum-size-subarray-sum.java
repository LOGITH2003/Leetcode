class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        //create the variable
        int size = nums.length , ans = Integer.MAX_VALUE, count = 0, index = 0;

        //iterate the array
        for(int i = 0 ; i < size ; i++)
        {
            count += nums[i];
            
            //sliding window approach
            while(target <= count-nums[index])
                count -= nums[index++];
            
            //if count reach the target check the condition
            if(target<=count)
                ans = Math.min(ans, i-index+1);
        }
        
        // check whether ans is equal to starting value return 0 else return the value
        return (ans == Integer.MAX_VALUE) ? 0 : ans ;
    }
}