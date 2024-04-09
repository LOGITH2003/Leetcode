class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;

        // iterate the array until the position become 0
        while(tickets[k] !=0){
            
            // iterate the array
            for(int i = 0;i<tickets.length;i++){
                if(tickets[i] !=0){
                    tickets[i]--;
                    count++;
                }
                if(tickets[k]==0)
                    return count;
            }
        }

        return count;
    }
}