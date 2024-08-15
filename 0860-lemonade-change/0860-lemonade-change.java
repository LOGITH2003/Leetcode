class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five = 0, ten = 0;

        for(int n : bills)
        {
            
            if(n == 10)
            {
                if(five == 0){
                    return false;
                }
                else{
                    five--;
                    ten++;
                }
            }
            else if(n == 20)
            {
                if(ten >=1 && five !=0)
                {
                    ten--;
                    five--;
                }
                else if(five >=3)
                {
                    five -=3;
                }
                else
                    return false;
            }
            else
            {
                five++;
            }
        }

        return true;

    }
}