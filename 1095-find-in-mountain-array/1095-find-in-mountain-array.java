/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
    
        int start = 0;
        int end = mountainArr.length()-1;
    
        //to get the peak number
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1))
            {
                end = mid;
            }
            else
                start = mid +1;
        }
        //return start;
        // System.out.println("set 0");
        // //applying the binary search in ascending order size
        int set = start;
        end = start;
        start = 0;
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) == target)
                return mid;
            else if(mountainArr.get(mid) < target)
                start = mid + 1;
            else
                end = mid-1;
        } 

        start = set+1;
        end = mountainArr.length()-1;
        while(start<=end)
        {
            int mid = start +(end - start) / 2 ;
            if(mountainArr.get(mid) == target)
                return mid;
            else if (mountainArr.get(mid) <target)
                end = mid-1;
            else
                start = mid + 1;
        }

        // System.out.println("set 1");
        // //applying the binary search in descending order size
        // start = set;
        // end = mountainArr.length()-1;
        
        // while(start>=end)
        // {
        //     int mid = start+ (end - start)/2;
        //     if(mountainArr.get(mid)==target)
        //         return mid;
        //     else if(mountainArr.get(mid)<target)
        //         end = mid+1;
        //     else
        //         start = mid -1;
        // }
        
        // // if the target is not in the array return -1;
         return -1;
    }
}