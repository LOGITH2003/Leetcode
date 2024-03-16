class Solution {
    public int findMaxLength(int[] nums) {
        
        // Create the HashMap
        HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();
        
        // Adding the default because if you start from 0 position 
        // some position ans will one len is lesser [1,0,0,1,1,0,0]
        list.put(0,-1);
        int count = 0,ans = 0;
        
        //iterating the array
        for(int i = 0;i< nums.length;i++)
        {
            count += nums[i]==0? -1:1;
            if(list.containsKey(count))
            {
                ans = Math.max(ans,i-list.get(count));
            }
            else
                list.put(count,i);
        }
        return ans;
    }
}