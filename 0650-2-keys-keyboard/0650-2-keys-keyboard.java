class Solution {
int count = 0;
    int prime(int n ){
        for(int i =2;i<=n/2;i++){
            if(n%i==0)
                return 0;
        }
        return 1 ;
    }
    public  int minSteps(int n) {
        if(n==1)
            return count;
        if( prime(n)==1)
            return count += n;
        for(int i = 2;i<=n/2;i++) {
            if (n % i == 0) {
                count += i;
                n /= i;
                break;
            }
        }
        return minSteps(n);

    }
}