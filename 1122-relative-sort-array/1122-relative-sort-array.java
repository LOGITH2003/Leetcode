class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        Map<Integer, Integer> map = new TreeMap<>();
        
        // iterate the array and get the count of the number
        for(int num : arr1)
            map.put(num, map.getOrDefault(num, 0) + 1);
        
        int index = 0;
        
        for(int num : arr2){
            
            // iterate the number util num value is became a zero
            while(map.get(num) > 0){
                arr1[index++] = num;
                map.put(num, map.get(num) - 1);
            }
        }
        
        for(HashMap.Entry<Integer, Integer> entry : map.entrySet()){
            while(entry.getValue() > 0){
                arr1[index++] = entry.getKey();
                map.put(entry.getKey(), map.get(entry.getKey()) - 1);
            }
        }
        
        return arr1;
    }
}