class Solution {
    public int minimumChairs(String s) {
        int count = 0,max = 0;
        for (char c : s.toCharArray()) {
            count = c == 'E' ? count + 1 : count - 1;
            max = Math.max(max, count);
        }
        return max;
    }
}