class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int count = 1, zeroCount = 0, index = 0;

        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == 0){
                zeroCount++;
                index = i;
            }
            else
                count *= nums[i];
        }

        // condition 1:
        // contain more than one zero
        if(zeroCount >1)
            return new int[nums.length];

        // condition 2:
        //contain only one zero
        if(zeroCount == 1)
        {
            int [] num = new int[nums.length];
            num[index] = count;
            return num;
        }

        // condition 3:
        // not contain zero
        else
        {
            for(int i  = 0;i<nums.length;i++)
                nums[i] = count/nums[i];
        }

        return nums;
    }
}
