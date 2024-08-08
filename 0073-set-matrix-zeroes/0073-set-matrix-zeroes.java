class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>(); 
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int num : row) 
        {            
            Arrays.fill(matrix[num], 0);
        }
        for(int num : col)
        {
            for(int i = 0; i < matrix.length; i++)
                matrix[i][num] = 0;
        }
    }
}