class Solution {
    public int longestOnes(int[] nums, int x) {
        
        int left = 0, right = 0,max = 0;

        Stack<Integer> list = new Stack<Integer>();
    
        // Sliding window approach
        
        while (right < nums.length) {
            
            //condition 1:
            if(nums[right] == 0)
                list.push(0);

            //condition 2:
            if(list.size() == x+1){
                max = Math.max(max,right-left);
                while(true){
                    if(nums[left++]==0){
                        list.pop();
                        break;
                    }
                }
            }
            right++;
        }
        return Math.max(max,right-left);
    }
}