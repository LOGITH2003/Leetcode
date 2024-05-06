class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int [] arr = new int[k];

        HashMap<Integer, HashSet<Integer>> list = new HashMap<>();
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

        for(var val : list.entrySet()){
            arr[val.getValue().size()-1]++;
        }
//        System.out.println(list);

        return arr;
    }
}