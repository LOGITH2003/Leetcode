class Solution {
    public int minPatches(int[] nums, int n) {
        long missNumber = 1;
        int count = 0,index = 0;
        
        while(missNumber<=n){
            if(index<nums.length && nums[index]<=missNumber){
                missNumber += nums[index++];
            }
            else{
                missNumber += missNumber;
                count++;
            }                
        }
        return count;
    }
}