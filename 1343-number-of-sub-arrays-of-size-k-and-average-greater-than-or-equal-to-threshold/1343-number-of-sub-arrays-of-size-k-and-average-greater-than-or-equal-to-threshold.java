class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int ans = 0,count = 0,start = 0,end = 0;
        
        while(end<arr.length)
        {    
            count += arr[end++];
            
            // condition 1 : 
            if(end>=k)
            {
                
                // condition 2 :
                if(threshold<=count/k && start<end)
                {
                    ans++;
                }
                
                count -= arr[start++];
            }   
        }
        
        // return the numOfSubarrays value
        return ans;
    }
}