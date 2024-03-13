class Solution {
    public int pivotInteger(int n) {
        
        //create the two variable 
        int count_1 = 0, count_2 = 0;
        
        //iterate the array to store the value in count_1
        for(int i =1;i<=n;i++)
        {
            count_1 += i;    
        }
        
        for(int i =n;i>0;i--)
        {
            //add the i value in count_2
            count_2 += i;
            
            //if the count are same return the i value
            if(count_1 == count_2)
            {
                return i;    
            }
            
            //sub the i value in count_1
            count_1 -= i;          
        }
        
        //if we not get any pivot integer 
        return -1;
    }
}