class Solution {
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        StringBuilder nums = new StringBuilder();
        for(char c :str.toCharArray())
            nums.append(c == '0' ? '1' : '0');

        return Integer.parseInt(nums.toString(),2);   
    }
}