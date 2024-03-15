class Solution {
    public int search(int[] nums, int target) {
        int pivot = Pivot(nums);
        
        // if pivot is -1. Start apply Binary search
        if(pivot == -1)
            return BinarySearch(nums, target,0,nums.length-1);
        
        if(target<nums[0])
            return BinarySearch(nums,target,pivot+1,nums.length-1);
        else
            return BinarySearch(nums,target,0,pivot);
    }
    
    // to get the pivot number
    static int Pivot(int [] nums)
    {
        
        int start = 0, end = nums.length-1;
        
        // applying the binary search 
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            //case 1
            if(mid < nums.length-1 && nums[mid] > nums[mid+1])
                return mid;
            
            //case 2
            if(0 < mid && nums[mid] < nums[mid-1])
                return mid-1;
            
            if(nums[start] < nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        
        return -1;
    }
    
    
    static int BinarySearch(int [] nums,int target, int start,int end)
    {
        while(start<=end)
        {
            int mid = start + (end-start) / 2;
            if(target == nums[mid])
                return mid;
            else if(target<nums[mid])
                end = mid -1;
            else
                start = mid +1;
        }
        return -1;
    }
}