class Solution {
    public boolean judgeSquareSum(int c) {
        for(long i = 0;i*i<=c;i++){
            double value = Math.sqrt(c-i*i);
            if(value == (int)value)
                return true;
        }
        return false;
    }
}