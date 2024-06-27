class Solution {
    public int findCenter(int[][] edges) {
        
        HashMap<Integer,Integer> list = new HashMap<>();
        for(int [] nums : edges){
            for(int num : nums){
                list.put(num,list.getOrDefault(num,0) + 1);
            }
        }
        for(int num : list.keySet()){
            if(list.get(num) == edges.length){
                return num;
            }            
        }
        
        return -1;
    }
}