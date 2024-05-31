class Solution {
    public int[] singleNumber(int[] nums) {
        
       ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums){
            if(list.contains(num)){
               list.remove((Integer) num);
            }
            else{
                list.add(num);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
        
    }
}