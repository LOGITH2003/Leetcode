class Solution {
    public int minimumLength(String s) {
        
        //create the two variable starting point and ending point
        int start = 0, end = s.length()-1;

        //using the two pointer approach
        while(start<end && s.charAt(start) == s.charAt(end))
        {
            //create the character variable to store start position character
            char c = s.charAt(start);

            //to iterate the string position to check the character are same
            while(start<end && s.charAt(start) == c)
                start++;
            
            //to iterate the string position to check the character are same
            while(start<=end && s.charAt(end) == c)
                end--;
        }

        //return the value 
        return end - start + 1;
    }
}