class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        
        int [] arr = new int[k];

        // create the hashmap to sort the user entry time and using hashset due to don't add the duplicate entry
        HashMap<Integer, HashSet<Integer>> list = new HashMap<>();

        // iterate the array to store in hashmap
        for (int[] log : logs) {
            HashSet<Integer> ls;
            if (list.containsKey(log[0])) {
                ls = list.get(log[0]);
            } else {
                ls = new HashSet<>();
            }
            ls.add(log[1]);
            list.put(log[0], ls);
        }

        // iterate the hashmap value and add the count of the value 
        for(var val : list.entrySet()){
            arr[val.getValue().size()-1]++;
        }

        // return the array
        return arr;
    }
}
