class Solution {
    public int fib(int n) {
        
        // using base condition
        if(n<2)
            return n;
        
        // recursion the method
        return fib(n-1)+fib(n-2);
    }
}