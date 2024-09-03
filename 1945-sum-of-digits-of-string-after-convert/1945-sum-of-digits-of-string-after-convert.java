class Solution {
    public int getLucky(String s, int k) {
        
        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray())
            str.append(c - '`');

        while(k--!=0){
            
            long sum = 0;            

            for(char c : str.toString().toCharArray())
                sum += c - '0';

            str.delete(0, str.length());
            str.append(sum);
        }

        return Integer.parseInt(str.toString());
    }
}