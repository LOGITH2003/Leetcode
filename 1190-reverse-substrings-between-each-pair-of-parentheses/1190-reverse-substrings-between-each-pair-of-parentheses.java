class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder(s);

        int index = 0,count = 0,start = -1,end = -1;
        while(index < s.length()) {
            if(s.charAt(index) == '(') {
                count++;
                if(count == 0 || count == 1)
                    start = index;

            }
            if(s.charAt(index) == ')') {
                count--;
                if(count == 0 || count == -1)
                    end = index;
            }
            if(count == 0 && start != -1 && end !=-1) {

                StringBuilder str = new StringBuilder(s.substring(Math.min(start,end)+1, Math.max(end,start)));
                str.reverse();
                sb.replace(Math.min(start,end), Math.max(start,end)+1, str.toString());
                return reverseParentheses(sb.toString());
            }
            index++;
        }

        return sb.toString();
    }
}