class Solution {
    public int minLength(String s) {
        Stack<Character> list = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(list.isEmpty())
                list.push(s.charAt(i));
            else if((s.charAt(i) == 'B' || s.charAt(i) == 'D' ) && list.peek()==s.charAt(i)-1)
                list.pop();
            else
                list.push(s.charAt(i));
        }
        return list.size();
    }
}