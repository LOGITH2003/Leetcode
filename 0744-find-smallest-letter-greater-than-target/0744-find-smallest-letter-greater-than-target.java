class Solution {
    public char nextGreatestLetter(char[] arr, char n) {
        
        int start = 0;
        int end = arr.length-1;
        //Binary search
        while(start<=end)
        {
            int mid =  start+(end-start)/2;
            if(arr[mid] >n)
                end = mid-1;
            else
                start = mid+1;
           
        }
        return arr[start%arr.length];
    }
}