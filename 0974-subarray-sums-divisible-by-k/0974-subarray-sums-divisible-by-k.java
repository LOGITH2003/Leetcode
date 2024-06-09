class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> remainderCount = new HashMap<>();
        remainderCount.put(0, 1);  // Base case to handle subarrays starting from the beginning
        
        int prefixSum = 0;
        int count = 0;
        
        for (int num : nums) {
            // Update the prefix sum
            prefixSum += num;
            // Calculate the remainder of the current prefix sum when divided by k
            int remainder = prefixSum % k;
            // Handle negative remainders by adjusting them to the range [0, k-1]
            if (remainder < 0) {
                remainder += k;
            }
            
            // If the remainder has been seen before, it means we have found some subarrays
            // whose sum is divisible by k
            if (remainderCount.containsKey(remainder)) {
                count += remainderCount.get(remainder);
            }
            
            // Update the count of this remainder in the hashmap
            remainderCount.put(remainder, remainderCount.getOrDefault(remainder, 0) + 1);
        }
        
        return count;
    }
}