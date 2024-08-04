class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            int count = 0;
            for(int j = i;j<nums.length;j++){
                count += nums[j];
                list.add(count);
            }
        }
        Collections.sort(list);
        int count = 0,temp = 0, M= 1000000007;
        for(int num:list){
            if(left-1<=temp && temp<right){
                count +=num;
                count %= M;
            }
            temp++;
        }
        return count;
    }
}