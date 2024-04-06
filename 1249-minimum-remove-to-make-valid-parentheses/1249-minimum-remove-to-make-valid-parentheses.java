class Solution {
    public String minRemoveToMakeValid(String s) {
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '(')
                count++;
            if(s.charAt(i) == ')')
                count--;
            if(count <0){
                return minRemoveToMakeValid(s.substring(0,i)+s.substring(i+1));
            }
        }
        for(int i = 0;i<count;i++){
            s = minRemoveToMakeValidOperation(s,'(');
        }

        return s;
    }
    public static String minRemoveToMakeValidOperation(String s,char c){

        for(int i =s.length()-1;i>=0;i--)
            if(s.charAt(i) == c)
                return s.substring(0,i)+s.substring(i+1);

        return s;      
    }
}