class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int remainder = 1;
        for(int i = digits.length-1;i>=0;i--)
        {
            digits[i] += remainder;
            list.add(digits[i]%10);
            remainder = digits[i]/10; 
        }
        if(remainder !=0)
            list.add(remainder);
        int size = list.size();
        int [] nums = new int[size];
        for(int i = 0;i<size;i++)
        {
            nums[size -i-1] = list.get(i);
        }

        return nums;
    }
}