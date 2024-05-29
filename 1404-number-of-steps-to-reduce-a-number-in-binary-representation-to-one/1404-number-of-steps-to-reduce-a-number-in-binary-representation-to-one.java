import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        
        // Convert the binary string into an BigInteger
        BigInteger n = new BigInteger(s,2);
        int count = 0;

        // Iterate until n becomes less than 1
        while (n.compareTo(BigInteger.ONE)>0) {

            // Increment by one for each iteration
            count++;

            // If n is even, divide by 2
            // Else, increment the value of n by one
            if (n.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
                n = n.divide(BigInteger.TWO);
            }
            else{
                n = n.add(BigInteger.ONE);
            }
        }

        // Return the count value
        return count;
        
    }
}