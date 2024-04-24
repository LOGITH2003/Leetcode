class Solution {
    public int tribonacci(int n) {
        int [] nums = new int[100];
        nums[1] = 1;
        nums[2] = 1;
        for(int i = 0;i<n;i++)
            nums[i+3] = nums[i]+nums[i+1]+nums[i+2];
        return nums[n];
    }
}