class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<5)
            return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;

        int left = 3,right = nums.length-1,count = 4;
        while(count-- !=0){
            min = Math.min(min,nums[right--]-nums[left--]);
        }
        return min;
    }
}