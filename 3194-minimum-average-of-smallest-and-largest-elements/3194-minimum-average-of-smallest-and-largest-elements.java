class Solution {
    public double minimumAverage(int[] nums) {
        double max = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int num : nums)
            list.add(num);
        return average(list,max);
    }

    public double average(ArrayList<Integer> nums, double max) {
        if(nums.isEmpty())
            return max;
        int minValue = Collections.min(nums);
        int maxValue = Collections.max(nums);
        nums.remove((Integer)minValue);
        nums.remove((Integer)maxValue);
        max = Math.min(max, (double) (minValue + maxValue) /2);
        return average(nums, max);
    }
}