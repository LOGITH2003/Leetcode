class Solution {
    public int findMaxK(int[] nums) {
        
        // sort an array  O(N log N)
        Arrays.sort(nums);

        //using two pointer approach
        int start = 0, end = nums.length-1;
        while(start<end){
            if((nums[start]*-1) == nums[end])
                return nums[end];
            else if((nums[start]*-1) < nums[end])
                end--;
            else
                start++;
        }
        
        // default return value
        return -1;
        
    }
}