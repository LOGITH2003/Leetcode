class Solution {
    public String removeDuplicates(String s) {
        
        // create the stack to remove the adjacent  duplicate array
        Stack<Character> list = new Stack<>();
        
        // create the string builder to store the answer
        StringBuilder str = new StringBuilder();
        
        // iterate the string
        for(char c : s.toCharArray())
        {
            if(list.size()!=0 && list.peek() == c){
                list.pop();
            }
            else 
                list.push(c);
        }
        
        // to store the remaining value in stringbuilder
        for(char c  : list)
            str.append(c);
        
        // return the value  
        return str.toString();
    }
}