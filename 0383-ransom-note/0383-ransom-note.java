class Solution {
    public boolean canConstruct(String s1, String s2) {
        HashMap<Character, Integer> list = new HashMap<Character,Integer>();
        for(int i = 0;i<s1.length();i++){
            if(list.containsKey(s1.charAt(i)))
                list.put(s1.charAt(i),list.get(s1.charAt(i))+1);
            else
                list.put(s1.charAt(i),1);
        }

        for(int i  = 0;i<s2.length();i++){
            if(list.containsKey(s2.charAt(i))){
                list.put(s2.charAt(i),list.get(s2.charAt(i))-1);
                if(list.get(s2.charAt(i)) == 0)
                    list.remove(s2.charAt(i));
            }
        }
        return list.size() == 0;
        
    }
}