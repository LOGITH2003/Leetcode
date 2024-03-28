class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max = 0,start = 0, end = 0,len = nums.length,count = 0;

        HashMap<Integer,Integer> list = new HashMap<>();

        while (end<len){
            if(list.containsKey(nums[end]))
            {
                list.put(nums[end],list.get(nums[end])+1);
                if(list.get(nums[end])>k) {
                    while (list.get(nums[end]) > k && start <= end) {
                        list.put(nums[start], list.get(nums[start]) - 1);
                        start++;
                        count--;
                    }
                }
            }
            else{
                list.put(nums[end],1);
            }
            end++;
            count++;
            max = Math.max(count,max);
        }
        return max;
    }
}