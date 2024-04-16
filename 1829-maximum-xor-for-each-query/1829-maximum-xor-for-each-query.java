class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        int [] num = new int[nums.length];

        int len = num.length-1,sqt = (2<<maximumBit-1)-1,orOperationValue = 0;

        // to get the total or gate operation value
        for(int n : nums)
            orOperationValue ^= n;

        /*
         example [0,1,1,3] maximumBit 2
         orOperationValue = 2
         when start iterate the array in reverse side
         we need answer like  orOperationValue ^ __ == Math.sqrt(maximumBit)-1 like that
         so that  we do like orOperationValue ^ Math.sqrt(maximumBit) = __
         after we reduce the array value for orOperationValue
        */
        for(int i = len;i>=0;i--){
            num[len-i] = sqt ^ orOperationValue;
            orOperationValue ^= nums[i];
        }

        return num;
    }
}