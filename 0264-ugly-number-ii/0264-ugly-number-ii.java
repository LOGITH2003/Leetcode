
class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        Set<Long> seen = new HashSet<>();
        

        minHeap.offer(1L);
        seen.add(1L);
        

        long uglyNumber = 1L;
        

        for (int i = 0; i < n; i++) {
            uglyNumber = minHeap.poll();
            

            for (int factor : new int[] {2, 3, 5}) {
                long newUgly = uglyNumber * factor;
                if (seen.add(newUgly)) {
                    minHeap.offer(newUgly);
                }
            }
        }
        
        return (int) uglyNumber;
    }
}
