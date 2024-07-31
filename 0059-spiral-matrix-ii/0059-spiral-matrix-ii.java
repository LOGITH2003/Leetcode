class Solution {
    public int[][] generateMatrix(int n) {
        int [][] list = new int[n][n];
        boolean [] condition  = {true, true};
        boolean [][] order = new boolean[n][n];
        int rows = n, cols = n, i = 0, j = 0,index = 1;
        while(true)
        {
            list[i][j] = index++;
            order[i][j] = true;
            if(condition[0])
            {
                if(condition[1] && j <= rows - 1)
                {
                    if(j == rows - 1 || order[i][j+1])
                    {
                        condition[0] = false;
                        condition[1] = true;
                        i++;
                    }
                    else
                    {
                        j++;
                    }
                }
                else
                {
                    if(j == 0 || order[i][j-1])
                    {
                        condition[0] = false;
                        condition[1] = false;
                        i--;
                    }
                    else
                    {

                        j--;
                    }

                }
            }
            else
            {
                if(condition[1] && i <= cols - 1)
                {
                    if (i == cols - 1 || order[i+1][j])
                    {
                        condition[0] = true;
                        condition[1] = false;
                        j--;
                    }
                    else
                    {
                        i++;
                    }
                }
                else
                {
                    if(i == 0 || order[i-1][j])
                    {
                        condition[0] = true;
                        condition[1] = true;
                        j++;
                    }
                    else
                    {

                        i--;
                    }
                }
            }

            if(index == (n*n)+1)
                return list;
        }

    }
}