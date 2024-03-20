class Solution {
    public int maxVowels(String s, int k) {
        int max = 0,count = 0;
        
        int start = 0, end = 0;
        
        
        // sliding window approach
        
        String str = "";
        
        while(end<s.length())
        {
            str += s.charAt(end++);
            
            // condition 1 :
            
            if(s.charAt(end-1)=='a' || s.charAt(end-1)=='e' || s.charAt(end-1)=='i' || s.charAt(end-1)=='o' || s.charAt(end-1)=='u')
            {
                count++;
            }
            
            // condition 2 :
            if(max == k || count == k)
                return Math.max(count,max);
            
            // condition 3 : 
            
            if(end >=k)
            {
                
                max = Math.max(count,max);
                
                // condition 4 : 
                
                if(s.charAt(start)=='a' || s.charAt(start)=='e' || s.charAt(start)=='i' || s.charAt(start)=='o' || s.charAt(start)=='u')
                {
                    count--;
                }
                str = str.substring(1,str.length());
                start++;
            }         
        }
        
        return max;      
    }
}


