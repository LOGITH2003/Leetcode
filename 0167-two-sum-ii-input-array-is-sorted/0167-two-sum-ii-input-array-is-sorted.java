class Solution {
    public int[] twoSum(int[] numbers, int target) {

        //create the variable to store the array length
        int size = numbers.length;

        //iterate the array to check the element
        for(int i = 0 ; i < size ; i++ )
        {

            //iterate the array 
            for(int j = i+1 ; j < size ; j++ )
            {
                //to check the condition 
                if(numbers[i]+numbers[j] == target )
                {
                    //return the position
                    return new int[] {i+1,j+1};
                }
            }
        }
        return new int[] {0,1};
    }
}