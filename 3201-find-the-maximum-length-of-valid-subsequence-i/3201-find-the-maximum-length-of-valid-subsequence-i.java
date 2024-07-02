class Solution {
    public int maximumLength(int[] nums) {
        
        // following the four condition like fully odd, fully even, even-odd combination, odd-even combination
        
        int odd = 0, even = 0, oddeven = 0, evenodd = 0;
        
        for(int num : nums){
            if(num%2==1){
                odd++;
                oddeven = evenodd+1;
            }
            else{
                even++;
                evenodd = oddeven+1;
            }
        }
        
        return Math.max(Math.max(odd,even), Math.max(oddeven, evenodd));
    }
}