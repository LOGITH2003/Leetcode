class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer>  temp= new HashSet<Integer>();
        
        for(int i =0;i<nums.length;i++){
            if(temp.contains(nums[i]))
                ans.add(nums[i]);
            else
                temp.add(nums[i]);
        }
        return ans;    
    }
}