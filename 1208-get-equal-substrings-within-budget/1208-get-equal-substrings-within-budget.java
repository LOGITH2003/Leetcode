class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        
        int size = 0,max = 0,len = s.length();
        
        int left = 0, right = 0,count = 0;
        // sliding window
        while (right < len) {
            int val1 = Math.abs(s.charAt(right) - t.charAt(right));
            if(val1 + count<=maxCost ){
                count+=val1;
                size++;
                right++;
            }
            else{                
                while(count+val1>maxCost){
                    int val2 = Math.abs(s.charAt(left) - t.charAt(left));
                    count-=val2;
                    size--;
                    left++;
                }
            }
            max = Math.max(max,size);
        }
        
        
        return max;
    }
}