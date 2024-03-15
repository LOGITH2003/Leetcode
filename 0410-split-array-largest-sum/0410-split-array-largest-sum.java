class Solution {
    public int splitArray(int[] nums, int k) {
        //create two variable 
        int max = 0;
        int sum = 0;

        //iterate the array to find the maximum number and sum of the array
        for(int n : nums)
        {
            max = (max<n)? n :max;
            sum += n;
        }

        //using the binary search
        while (max<sum)
        {
            int mid = max + (sum - max) / 2;
            int temp = Days(nums,mid);
            if(temp > k )
                max = mid+1;
            else
                sum = mid;
        }
        return sum;
    }

    static int Days(int [] nums, int capacity)
    {
        int days = 1, storage = 0;

        for(int n : nums)
        {
           if(n+storage>capacity)
           {
                days++;
               storage = n;
           }
            else
                storage += n;
        }
        return days;
    } 
}