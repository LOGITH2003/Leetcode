class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String [] str = s.split(" ");
        
        // condition 1:
        if (pattern.length() != str.length)
            return false;

        // condition 2:
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(!map.containsKey(c) && !set.contains(str[i])){
                map.put(c, str[i]);
                set.add(str[i]);
            }
            else if( (!map.containsKey(c) && set.contains(str[i])) || !map.get(c).equals(str[i])){
                return false;
            }
        }

        return true;
    }
}