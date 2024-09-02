class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int index = 0,len = chalk.length;
        while(k>=chalk[index]){

            k-=chalk[index++];

            if(index==len)
                index = 0;
            
        }
        return index;
    }
}