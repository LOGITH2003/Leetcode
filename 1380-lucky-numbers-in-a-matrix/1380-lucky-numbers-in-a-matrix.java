class Solution {
    public List<Integer> luckyNumbers (int[][] nums) {

        List<Integer> num = new ArrayList<>();
        ArrayList<Integer> num01 = new ArrayList<>();
        ArrayList<Integer> num02 = new ArrayList<>();

        for(int i = 0;i<nums.length || i<nums[0].length;i++)
        {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for(int j = 0;j<nums.length || j<nums[0].length;j++)
            {
                if(i<nums.length && j<nums[0].length)
                    min = Math.min(min, nums[i][j]);
                if(j<nums.length && i<nums[0].length)
                    max = Math.max(max, nums[j][i]);
            }
            num01.add(min);
            num02.add(max);
        }

        for(int n : num01)
        {
            if(num02.contains(n))
                num.add(n);
        }

        return num;
    }
}