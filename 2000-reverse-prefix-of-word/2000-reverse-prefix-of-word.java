class Solution {
    public String reversePrefix(String word, char ch) {
        String ans = "";
        int x =-1;
        for(int i =0;i<word.length();i++){
            if(ch==word.charAt(i)){
                x=i;
                break;
            }
        }
        if(x==-1)
            return word;
        for(int i =x;i>=0;i--)
            ans +=Character.toString(word.charAt(i));
        for(int i =x+1;i<word.length();i++)
            ans +=Character.toString(word.charAt(i));
        return ans;
    }
}