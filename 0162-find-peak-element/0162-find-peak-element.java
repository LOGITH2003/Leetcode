class Solution {
    public int findPeakElement(int[] nums) {
        
        //create the three integer values
        int start = 0;
        int end = nums.length-1;

        
        //using the Binary search
        while(start<end)
        {
            int mid = start +(end-start)/2;    
            if(nums[mid]<nums[mid+1])
                start = mid+1;
            else
                end = mid;
        }
        return start;
    }
}