class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        //create the variable to store the maximum frequency element
        int count = 0;

        //create the variable to get the maximum frequency element
        int max = 1;

        //create the hashmap to store the maximum frequency
        HashMap<Integer,Integer> list = new HashMap<>();

        //iterate the array using foreach
        for(int n : nums)
        {
            if (list.containsKey(n))
            {
                list.put(n,list.get(n)+1);
                max = Integer.max(max,list.get(n));
            }
            else
            {
                list.put(n,1);
            }
        }

        //iterate the array
        for(Map.Entry<Integer,Integer> ls : list.entrySet())
        {
            //if maximum value is equal to get value count will be increase 
            if (ls.getValue() == max)
            {
                count += ls.getValue();
            }
        }

        //return the maximum frequency element
        return count;   
    }
}