class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = 0,remainder = 0;

        while(numBottles+remainder >=numExchange) {
            count += numBottles;
            int temp = remainder;
            remainder = (numBottles+remainder)%numExchange;
            numBottles = (numBottles+temp)/numExchange;
        }

        return count+numBottles;
    }
}