class Solution {
    public String countAndSay(int n) {
        
        String str = "1";

        while(n!=1)
        {
            String inst = "";
            int count = 1;
            char ch = str.charAt(0);
            for(int i=1;i<str.length();i++)
            {
                if(ch!=str.charAt(i))
                {
                    inst += String.valueOf(count) + ch;
                    ch = str.charAt(i);
                    count = 1;
                }
                else
                    count++;
            }
                str = inst + String.valueOf(count) + ch;
            n--;
        }
        return str;
    }
}