class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int [] arr = Arrays.copyOf(nums, nums.length);
        int count = 0;
        while(true)
        {
            List<Integer> list = new ArrayList<>();

            int temp = 0;
            for(int j = 0; j < nums.length; j++){
                list.add(arr[j]);
                if(arr[j] == nums[j])
                    temp++;

            }
            if(temp == nums.length)
                count++;
            if(count == 2)
                return res;
            res.add(list);
            arr = Arrays.copyOf(nextPermutation(arr), nums.length);
        }

    }


    public int[] nextPermutation(int[] nums) {

        int size = nums.length, pivot = size - 2;

        while (pivot >= 0 && nums[pivot] >= nums[pivot + 1]) {
            pivot--;
        }

        if (pivot >= 0) {
            int nextPivot = size - 1;
            while (nums[nextPivot] <= nums[pivot])
                nextPivot--;

            swap(nums, pivot, nextPivot);

            reverse(nums, pivot + 1, size - 1);
        } else {
            Arrays.sort(nums);
        }
        return nums;
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