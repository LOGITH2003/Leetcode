class Solution {
    public int specialArray(int[] nums) {
        int val = 0;
        for (int x = 0; x <= nums.length; x++) {
            int count = 0;

            for (int num : nums) {
                if (num >= x) {
                    count++;
                }
            }

            if (count == x) {
                val =  x;
                break;
            }
        }
        if(val==0)
            return -1;
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>=val) {
                count++;
            }
        }

        return count;
    }
}