class Solution {
    public void reverseString(char[] s) {
        
        int len = s.length-1;
        
        // swap the position in two pointer approach
        for(int i = 0;i<=len/2;i++){
            char c = s[i];
            s[i] = s[len-i];
            s[len-i] = c;
        }
    }
}