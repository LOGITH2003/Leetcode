class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0, precount;
        for(int n : nums){
            precount = count;
            count = (count+n)%k;
            if(set.contains(count)){
                return true;
            }
            set.add(precount);
        }
        return false;
    }
}