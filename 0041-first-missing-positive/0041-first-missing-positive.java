class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);
        
        int count = 1;
        
        for(int n : nums){
            if(n == count)
                count++;
        }
        
        return count;
    }
}