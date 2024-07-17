class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<Character>();
        Stack<Integer> position = new Stack<>();
        int index = 0;
        while(index<s.length())
        {
            if(s.charAt(index) == '[')
            {
                stack.push('[');
                position.push(index);
            }
            else if(s.charAt(index) == ']')
            {
                stack.pop();
                int start = position.pop()+1;
                int end = index,temp = start-1;
                StringBuilder str = new StringBuilder();
                StringBuilder string = new StringBuilder();
                while(--temp>=0 && Character.isDigit(s.charAt(temp)))
                    str.append(s.charAt(temp));

                str.reverse();

                for(int i=0;i<Integer.parseInt(str.toString());i++)
                {
                    string.append(s, start, end);
                }
                s = s.replace(s.substring(temp+1,end+1),string.toString());
                break;
            }
            index++;
        }

        if(!s.contains("["))
            return s;
        return decodeString(s);
    }
}