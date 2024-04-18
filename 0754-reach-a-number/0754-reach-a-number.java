class Solution {
    public int reachNumber(int target) {
        
        // to make the neg number to pos number
        target = Math.abs(target);
        
        int count = 0;
        while(target>0){
            target -=++count;
        }
        
        return target%2==0?count:count+1+count%2;
        
    }
}