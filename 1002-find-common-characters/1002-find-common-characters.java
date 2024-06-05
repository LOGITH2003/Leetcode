class Solution {
    public List<String> commonChars(String[] words) {
        
        List<String> list = new ArrayList<String>();

        for(char c : words[0].toCharArray()){
            boolean found = true;
            for(int i = 1; i < words.length; i++){
                if(words[i].indexOf(c) == -1){
                    found = false;
                    break;
                }
                else{
                    words[i] = words[i].replaceFirst(Character.toString(c), "*");
                }
            }
            if(found){
                list.add(Character.toString(c));
            }
        }

        return list;
    }
}