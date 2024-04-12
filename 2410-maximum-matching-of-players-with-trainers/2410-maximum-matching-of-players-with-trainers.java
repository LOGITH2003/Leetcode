class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        // sort the both of the array
        Arrays.sort(players);
        Arrays.sort(trainers);

        int index = 0,count = 0;

        // iterate the array
        for(int n : players){
            while(index<trainers.length){
                if(n<=trainers[index++]){
                    count++;
                    break;
                }

                // if the index is greater than trainers array length break
                if(index>=trainers.length)
                    break;
            }
        }
        return count;
    }
}