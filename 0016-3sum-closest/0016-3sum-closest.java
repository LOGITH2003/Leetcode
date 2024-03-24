class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int min = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for(int i = 0;i<nums.length-2;i++){
            int start = i+1, end = nums.length-1;

            while(start<end){
                int count = nums[i]+nums[start]+nums[end];

                if(count<target)
                    start++;

                else
                    end--;

                min = findNearestNumber(min,count,target);
            }
        }

        return min;
    }

    public static int findNearestNumber(int num1, int num2, int target) {
        int diff1 = Math.abs(num1 - target);
        int diff2 = Math.abs(num2 - target);

        if (diff1 < diff2)
            return num1;
        else
            return num2;
    }
}