class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return Permutation(nums, 0, nums.length-1);
    }
    public static List<List<Integer>> Permutation(int[] nums, int start, int end) {
        List<List<Integer>> result = new ArrayList<>();
        if (start == end) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
        } else {
            for (int i = start; i <= end; i++) {
                swap(nums, start, i);
                List<List<Integer>> permutations = Permutation(nums, start + 1, end);
                result.addAll(permutations);
                swap(nums, start, i);
            }
        }
        return result;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}