class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary);
        
        StringBuilder str = new StringBuilder();

        String [] arr = sentence.split(" ");

        for(String s : arr){
            boolean found = false;
            for(String val : dictionary){
                int index = 0;
                while(index<s.length() && index<val.length()){
                    if(s.charAt(index)!=val.charAt(index)){
                        break;
                    }
                    if(index == val.length()-1){
                        str.append(val).append(" ");
                        found = true;
                    }
                    index++;
                }
                if(found)
                    break;
            }
            if(!found){
                str.append(s).append(" ");
            }
        }
        return (str.toString()).trim();
    }
}