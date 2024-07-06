class Solution {
    public int passThePillow(int n, int time) {
        
        int dir = 0;

        while(n<=time){
            time -=n-1;
            dir++;
        }

        return dir%2==0?time+1:n-time;

    }
}