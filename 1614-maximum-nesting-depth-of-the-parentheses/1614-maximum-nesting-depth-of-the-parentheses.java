class Solution {
    public int maxDepth(String s) {
        int count = 0,size = Integer.MIN_VALUE;
        
        // iterate the string
        for(int i =0;i<s.length();i++){
            
            // condition 1
            if(s.charAt(i)== '(')
                count++;
            
            // condition 2
            if(s.charAt(i)==')')
                count--;
            
            size = Math.max(size, count);
        }
        
        return size;
    }
}