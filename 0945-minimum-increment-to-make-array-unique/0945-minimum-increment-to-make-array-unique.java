class Solution {
    public int minIncrementForUnique(int[] nums) {
        int count = 0;

        Arrays.sort(nums);
                
        for(int i = 1; i < nums.length; i++){
            while (nums[i - 1] >= nums[i]) {
                count++;
                nums[i]++;
            }
        }

        return count;
    }
}