class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        //create the hashset to store the data
        HashSet<Integer> list = new HashSet<Integer>();

        //iterate the array
        for(int num1 : nums1)
        {
            //iterate the array
            for(int num2 : nums2)
            {
                // if the both same add in hashset list
                if(num1 == num2)
                {
                    list.add(num1);
                    break;
                }
            }
        }

        //create the array 
        int [] arr = new int[list.size()];

        int count = 0;

        //iterate the list to store the array
        for(int num : list)
        {
            arr[count++] = num;
        }

        //return the array
        return arr;
    }
}