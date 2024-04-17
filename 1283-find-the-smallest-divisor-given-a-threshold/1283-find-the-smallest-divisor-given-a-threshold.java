class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int end = Arrays.stream(nums).max().getAsInt(),start = 1,mid = 0;

        // start approach using binary search
        while(start<=end){

            mid = start + (end - start)/2;

            // to get the divided value
            int div = smallestDivisorValue(mid,nums);
            
            if(start == end){
                return mid;
            }
            else if(div<=threshold){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return mid;

    }
    public static int smallestDivisorValue(int target, int [] nums){

        int count = 0;

        // iterate the array to count the value
        for(int n : nums){

            // if the  n divided by the target if the remain is 0
            // add the divided value otherwise add the divided value and plus one
            
            if(n%target == 0)
                count += n/target;
            
            else
                count += (n/target)+1;
        }

        return count;
    }
}
