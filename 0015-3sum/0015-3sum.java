class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //to declare the variable to store the number size
        int size = nums.length;

        //create the list<list<Integer>>
        List<List<Integer>> list = new ArrayList<>();


        //sorting the array
        Arrays.sort(nums);

        //to iterate the array
        for(int i = 0 ; i < size - 2 ; i++ )
        {
            //to checkt the condition whether the same number 
            if(i == 0 ||  nums[i] != nums[i-1])
            {
                
                int start = i+1;
                int end = size -1;
                
                //using the math.abs to convert the number into positive number
                int target = Math.abs(nums[i]);
                
                //two pointer approach
                while(start<end)
                {
                    if(nums[start]+nums[end] == target)
                    {
                        list.add(Arrays.asList(nums[i],nums[start],nums[end]));
                        while(start<end && nums[start] == nums[start+1]) start++;
                        while(start<end && nums[end] == nums[end-1]) end--;
                        start++;
                        end--;
                    }
                    else if(target<nums[start]+nums[end])
                        end--;
                    else
                        start++;
                }
            }
        }
        
        //to return the output
        return list;
    }
}