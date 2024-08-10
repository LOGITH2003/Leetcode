class Solution {
    public void nextPermutation(int[] nums) {
         int size = nums.length, pivot = size-2;

        while (pivot >= 0 && nums[pivot] >= nums[pivot+1])
        {
            pivot--;
        }

        if(pivot >=0)
        {
            int nextPivot = size-1;
            while (nums[nextPivot] <= nums[pivot])
                nextPivot--;

            swap(nums,pivot,nextPivot);

            reverse(nums,pivot+1, size-1);
        }
        else
        {
            Arrays.sort(nums);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
    
}