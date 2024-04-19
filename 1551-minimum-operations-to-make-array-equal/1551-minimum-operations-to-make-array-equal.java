class Solution {
    public int minOperations(int n) {
        int count = 0,num = 0;
        int [] arr = new int[n];

        for(int i = 0;i<n;i++){
            count += (i*2)+1;
            arr[i] = (i*2)+1;
        }
        count /=n;
        for(int i = 0;i<n/2;i++){
            num += count - arr[i];
        }
        return num;
    }
}