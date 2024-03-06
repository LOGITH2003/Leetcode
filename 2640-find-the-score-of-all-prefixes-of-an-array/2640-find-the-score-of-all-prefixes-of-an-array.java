class Solution {
    public long[] findPrefixScore(int[] nums) {
        
        //create the integer variable to store the size of the given array
        int size = nums.length;

        //create the long array
        long [] arr = new long[size];

        //create the new long variable to store the operation value
        int val = 0;
        long store_val = 0;

        //iterate the array 
        for(int i =0;i<size;i++){

            //using this variable we can get the maximum number in current prefix iteration
            val = Math.max(val, nums[i]);

            //calculate the variable to store in array
            store_val +=  val+nums[i];

            //store the variable in the array
            arr[i] = store_val;
        }

        //return the array;
        return arr;
    }
}