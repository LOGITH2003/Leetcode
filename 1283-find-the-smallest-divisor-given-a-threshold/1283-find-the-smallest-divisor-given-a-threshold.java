class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int end = Arrays.stream(nums).max().getAsInt(),start = 1,answer = 0,mid = 0;

//         for(int n : nums)
//             end += n;

        while(start<=end){

            mid = start + (end -start)/2;

            int div = smallestDivisorValue(mid,nums);
            if(start == end)
                return mid;
            else if(div<=threshold){
//                answer = mid;
                end = mid;
//                while(div<=threshold && mid!=0){
//                    answer = mid;
//                    mid-=1;
//                    div = smallestDivisorValue(mid,nums);
//                }
//                return answer;
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