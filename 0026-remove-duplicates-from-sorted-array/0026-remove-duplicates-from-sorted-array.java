class Solution {
    public int removeDuplicates(int[] nums) {
        
        int start = 0, end = 0;
        
        while(end<nums.length && start<=end)
        {
            if(nums[start] == nums[end])
            {
                end++;    
            }    
            else
            {
                
                nums[++start] = nums[end];
            }
        }
        return start+1;
    }
}