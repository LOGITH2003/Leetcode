class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        //Sorting the first array 
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //iterate the nums1 arry
        for(int i : nums1)
        {
            //iterate the nums2 array
            for(int j : nums2)
            {
                // if the both value are equal return the number
                if(i==j)
                {
                    return i;
                }
                else if(j<i)
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
        }
        return -1;
    }
}