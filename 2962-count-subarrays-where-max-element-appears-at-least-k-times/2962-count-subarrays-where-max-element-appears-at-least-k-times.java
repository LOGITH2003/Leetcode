class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxElement = Arrays.stream(nums).max().getAsInt();
        long ans = 0;
        int start = 0, count = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == maxElement) {
                count++;
            }
            while (k == count) {
                if (nums[start] == maxElement) {
                    count--;
                }
                start++;
            }
            ans += start;
        }

        return ans;
    }
}