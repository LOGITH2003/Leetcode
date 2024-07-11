class Solution {
    public boolean rotateString(String s, String goal) {

        // condition 1:
        if(s.length() != goal.length() || s.indexOf(goal.charAt(0)) == -1)
            return false;

        // condition 2:
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == goal.charAt(0))
            {
                if(checkUp(s,goal,i,0))
                    return true;
            }
        }

        return false;
    }

    public static boolean checkUp(String s, String goal, int index1, int index2){

        while(index2<goal.length()){

            // condition 1:
            if(s.charAt(index1++)!=goal.charAt(index2++))
                return false;

            // condition 2:
            if(index1 == s.length())
                index1 = 0;

        }

        return true;
    }
}