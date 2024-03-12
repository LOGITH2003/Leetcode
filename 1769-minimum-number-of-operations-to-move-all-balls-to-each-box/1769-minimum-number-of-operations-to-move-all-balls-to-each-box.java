class Solution {
    public int[] minOperations(String boxes) {
        
        //create an string length of an array
        int ans[] = new int[boxes.length()];

        //iterate the array
        for(int i =0;i<boxes.length();i++)
        {
            int count = 0;
            
            //iterate the array to check in all the position
            for(int j = 0;j<boxes.length();j++)
            {
                if(boxes.charAt(j)=='1')
                {
                    count +=Math.abs(i-j);
                }
            }    
            ans[i] = count;
        }
        return ans;
    }
}