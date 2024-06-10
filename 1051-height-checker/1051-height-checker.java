class Solution {
    public int heightChecker(int[] heights) {
        int count =0,index = 0;
        int [] temp = heights.clone();
        Arrays.sort(temp);
        while(index<heights.length)
            if(temp[index] != heights[index++])
                count++;
        return count;
    }
}