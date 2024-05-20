class Solution {
    public int subsetXORSum(int[] nums) {
        return subsetXORSumHelper(nums,0,0);
    }

    public int subsetXORSumHelper(int[] nums,int index, int current) {
        if(index == nums.length)
            return current;

        int left = subsetXORSumHelper(nums,index+1,current^nums[index]);
        int right = subsetXORSumHelper(nums,index+1,current);

        return left+right;
    }
}