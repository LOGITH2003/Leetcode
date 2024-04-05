class Solution {
    public String makeGood(String s) {
        if(s.isEmpty())
            return s;

        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)-32 == s.charAt(i+1) || s.charAt(i)+32 == s.charAt(i+1)){
                return makeGood(s.substring(0,i)+s.substring(i+2));
            }
        }

        return s; 
    }
}