class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int len = groupSizes.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(groupSizes[i])) {
                map.get(groupSizes[i]).add(i);
            }
            else {
                map.put(groupSizes[i], new ArrayList<>());
                map.get(groupSizes[i]).add(i);
            }
        }

        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
               List<Integer> list = new ArrayList<>();
               for(Integer i : entry.getValue()) {
                   list.add(i);
                   if(list.size()==entry.getKey()){
                       res.add(list);
                       list = new ArrayList<>();
                   }
               }
               if(!list.isEmpty()){
                   res.add(list);
               }

        }

        return res;
    }
}