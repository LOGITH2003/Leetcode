class Solution {
    public int smallestDistancePair(int[] nums, int k) {

        int max = 0;
        for(int n : nums)
            max = Math.max(n,max);

        int [] arr = new int[max+1];

        int size = nums.length;
        for(int i = 0;i<size;i++)
            for(int j = i+1;j<size;j++)
                ++arr[Math.abs(nums[i]-nums[j])];

        for(int i = 0;i<max+1;i++)
        {
            k -= arr[i];
            if(k<=0)
                return i;
        }
        return -1;
    }
}