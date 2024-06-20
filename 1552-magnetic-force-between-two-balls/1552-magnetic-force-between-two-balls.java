class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start = 0, end = position[position.length - 1];
        while (start < end) {
            int mid = (start + end) / 2;
            if(checker(position,m,mid+1))
                start = mid + 1;
            else 
                end = mid;
        }
        return start;
    }
    public boolean checker(int[] position, int m, int val) {
         int count = 0;
        double index = -1e100;
        for(int n : position){
            if(n-index >=val){
                index = n;
                count++;
            }
        }
        return count>=m;
    }
}