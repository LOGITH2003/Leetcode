class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a = nums.length;
        for(int i =0;i<a;i++){
            for(int j =i+1;j<a;j++){
                if(target == nums[i]+nums[j])
                    return new int[]{i,j};
            }
        }
        return null;
    }
}