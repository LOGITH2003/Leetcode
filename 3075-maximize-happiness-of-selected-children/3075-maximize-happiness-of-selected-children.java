class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int index = 0;
        long n = 0;
        // sorting an array 
        Arrays.sort(happiness);
        while(true){
            // create the three condition 
            if(index ==happiness.length || happiness[happiness.length-1-index]-index<=0 || k==0)
                return n;
            n += happiness[happiness.length-1-index]-index;
           k--;
           index++;
        }
    }
}