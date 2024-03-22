class Solution {
    public int myAtoi(String s) {
        // to remove the unwanted space
        s = s.trim();

        // condition 1 :
        if(s.length() == 0)
            return 0;

        // convert the string to character array
        String [] arr = s.split("\\s+");

        // change the s to arr[0] value
        s = arr[0];

        double val = 0, symbol = 0;
        
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)<58 && s.charAt(i)>47)
                val = (val*10) + Integer.valueOf(s.substring(i,i+1));
            else if(s.charAt(i)<46 && i == 0)
                symbol++;
            else 
                break;
        }

        // condition 2 :
        if(s.charAt(0) == '-')
            val *=-1;
        
        // condition 3 :
        if(val<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        else if(val > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        else
            return (int) val;
    }
}