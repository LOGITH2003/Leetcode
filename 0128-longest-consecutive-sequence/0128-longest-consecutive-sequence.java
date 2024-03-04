class Solution {
    public int longestConsecutive(int[] nums) {
        
        //if integer array is empty return 0
        if(nums.length == 0)
            return 0;
        
        //Sorting the array nums
        Arrays.sort(nums);
        
        //initial the two variable 
        //for the count we initial the value as 1
        //because we comparing the 
        int count = 1;
        int answer = 0;
          
        System.out.println(Arrays.toString(nums));
        
        //iterate the array using the for loop 
        for( int i = 0; i < nums.length-1 ; i++ )
        {
            
            // to check the condition whether the condition are same 
            //if same increase the count
            if(nums[i]+1 == nums[i+1])
            {
                count++;    
            }
            else if(nums[i] == nums[i+1])
            {
                continue;
            }
            else
            {
                //whether the two number are not same 
                //checking the condition count is greater than answer 
                if(answer<count)
                {
                    answer = count;
                   
                }
                 count = 1;
            }
        }
        
        //checking the condition count is greater than answer if
        //return the count
        if(answer<count)
        {
            return count;
        }
        
        // return the answer
        return answer;
    }
}