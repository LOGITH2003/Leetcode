class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        //create the two integer variable
        int start = 0;
        int end = nums.length-1;
        //Binary search
        while(start<=end)
        {
            int mid =  start+(end-start)/2;
            
            if(nums[mid]==target)
            {
                start = mid;
                end = mid;
                //iterate the array if the target is equal to the position it iterate
                while(start!=-1 && nums[start] == target)
                {
                    start--;
                }
                //iterate the array if the target is equal to the position it iterate
                while(end!=nums.length && nums[end] == target)
                {
                    end++;
                }
                
                return new int[]{start+1,end-1};
            }
            
            else if(nums[mid]<target)
                 start = mid+1;
            
            else
               end = mid-1;
        }

        return  new int[]{-1,-1};
    }
}