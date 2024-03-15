class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        //create two integer variable start and end
        int start = 0;
        int end = arr.length-1;

        // applying binary search
        while(start<end)
        {
            int mid = start + ( end - start ) / 2;
            if(arr[mid]>arr[mid+1])
                end = mid;
            else
                start = mid+1;
        }

        return start;
    }
}