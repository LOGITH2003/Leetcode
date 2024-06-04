class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        // iterate the character load the value in HashMap
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        boolean set = true;
        // iterate the hashmap
        for(HashMap.Entry<Character, Integer> entry : map.entrySet()) {
            // condition 1:
            if(entry.getValue()%2==1 && set){
                count += entry.getValue();
                set = false;
            }
            
            // condition 2:
            else if(entry.getValue()%2==1){
                count += entry.getValue()-1;
            }
            
            // condition 3:
            else if(entry.getValue()%2==0){
                count += entry.getValue();
            }
        }
        
        return count;
    }
}