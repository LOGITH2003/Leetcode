class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0,end = people.length-1,count = 0;

        // using two pointer approach
        while (start<=end){
            if(people[end] + people[start] <= limit)
                start++;
            
            end--;
            count++;
        }   
        return count;
    }
}