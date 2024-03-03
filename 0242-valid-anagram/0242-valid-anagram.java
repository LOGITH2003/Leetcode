class Solution {
    public boolean isAnagram(String s, String t) {
        char[] char01 = s.toCharArray();
        char[] char02 = t.toCharArray();
        Arrays.sort(char01);
        Arrays.sort(char02);
        s = new String(char01);        
        t = new String(char02);
        return s.equals(t);
    }
}