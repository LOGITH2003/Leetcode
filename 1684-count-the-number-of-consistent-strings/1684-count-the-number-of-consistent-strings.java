class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;

        TreeSet<Character> mainSet = new TreeSet<>();

        for(char c : allowed.toCharArray())
            mainSet.add(c);

        for(String word : words){
            TreeSet<Character> subSet = new TreeSet<>();
            for(char c : word.toCharArray()){
                if(!mainSet.contains(c)){
                    count--;
                    break;
                }
            }
                
        }
        return count;
    }
}