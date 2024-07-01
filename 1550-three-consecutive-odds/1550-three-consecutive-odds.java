class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int index = 0;
        while(index<arr.length-2){
            if(arr[index++]%2==1 && arr[index]%2==1 && arr[index+1]%2==1)
                return true;
        }
        return false;
    }
}