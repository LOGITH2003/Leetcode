class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(ansIsomorphic(s,t)){
            if(ansIsomorphic(t,s)){
                return true;
            }
        }

        return false;
    }
    static boolean ansIsomorphic(String s, String t){
        HashMap<Character,Character> list = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(list.containsKey(s.charAt(i)))
                if(list.get(s.charAt(i))!=t.charAt(i))
                    return false;
            list.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }
}