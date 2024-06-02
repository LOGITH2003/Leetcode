class Solution {
    public String clearStars(String s) {
                
        // Create a hashmap to store character counts
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        // Convert the string into a character array and iterate using foreach
        for(char c : s.toCharArray()) {
            if(c == '*'){
                
                for(char ch = 'a'; ch <= 'z'; ch++){
                    
                    // If character is contained in hashmap, following the condition
                    if(map.containsKey(ch) && map.get(ch) > 0){

                        // Decrease the value by one in the character map
                        map.put(ch, map.get(ch)-1);
                        
                        // Create a new StringBuilder
                        StringBuilder sbr = new StringBuilder(sb.toString());
                        
                        // Reverse the StringBuilder and store the index value
                        // Remove the value in the StringBuilder
                        sbr.reverse();
                        int index = sbr.indexOf(String.valueOf(ch));
                        sb.deleteCharAt(sb.length()-index-1);
                        break;
                    }
                }
            }
            else{
                
                // Increase the value by one in the character map
                // Append the character to the StringBuilder
                map.put(c, map.getOrDefault(c, 0) + 1);
                sb.append(c);
            }
        }
        
        // Convert the StringBuilder to a string
        return sb.toString();
    }
}