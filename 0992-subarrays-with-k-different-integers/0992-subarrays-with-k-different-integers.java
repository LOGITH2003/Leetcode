class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return Ans(nums,k)-Ans(nums,k-1);
    }
    
    public static int Ans(int [] nums,int k){
         int count = 0,start = 0,end = 0;

        HashMap<Integer,Integer> list = new HashMap<>();

        // sliding window
        while(end<nums.length){
            if(!list.containsKey(nums[end])){
                list.put(nums[end],1);
            }
            else
                list.put(nums[end],list.get(nums[end])+1);

            if(list.size()>k){
                while(list.size()>k){
                    list.put(nums[start],list.get(nums[start])-1);
                    if(list.get(nums[start])==0)
                        list.remove(nums[start]);
                    start++;
                }
            }
            count += (end-start+1);
            end++;
        }
        return count;
    }
}