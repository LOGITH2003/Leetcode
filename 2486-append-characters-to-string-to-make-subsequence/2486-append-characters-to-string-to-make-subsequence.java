class Solution {
    public int appendCharacters(String s, String t) {
        int max = 0,index = 0;

        for(int i = 0; i < s.length(); i++){
            if(index<t.length() && s.charAt(i) == t.charAt(index)){
                while(i<s.length() && index<t.length() && s.charAt(i) == t.charAt(index)){
                    index++;
                    i++;
                }
                
                max = Math.max(max, index);
            }
        }

        return t.length()-max;
    }
}