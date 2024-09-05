class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int ans[] = new int[n];
        int ans1[] = new int[0];
        int add = 0;
        for(int i =0;i<rolls.length;i++)
            add +=rolls[i];
        int x = (mean*(rolls.length+n))-add, y = n;
        if( n<=x && x<=6*n){
        for(int i =0;i<n;i++){
            ans[i] = (x/y);
            x -=(x/y);
            y--;
        }}
        else
            return ans1;
        
        return ans;
    }
}