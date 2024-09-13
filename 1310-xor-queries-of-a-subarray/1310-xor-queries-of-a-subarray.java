class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int [] result = new int[queries.length];
        int index = 0;
        
        for(int [] array : queries)
        {
            int value = arr[array[0]];
            for(int i = array[0]+1; i <= array[1]; i++)
            {
                value ^= arr[i];
            }
            result[index++] = value;
        }
        
        return result;
    }
}