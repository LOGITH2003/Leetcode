class Solution {
    public double averageWaitingTime(int[][] nums) {
        
        double finishingTime = nums[0][0], waitingTime = 0;
        
        for(int [] num : nums){
            finishingTime = finishingTime>=num[0]? finishingTime+num[1]: num[0]+num[1];
            waitingTime += (finishingTime-num[0]);
        }

        return waitingTime /nums.length;
    }
}